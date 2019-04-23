package com.platform.chorus.db.utils;

import org.apache.commons.cli.CommandLine;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Create by A.T on 2019/4/11
 */
public class PgsqlSchemaTool {
    private String ip;
    private String port;
    private String user;
    private String password;

    PgsqlSchemaTool(String ip, String port, String user, String password) {
        this.ip = ip;
        this.port = port;
        this.user = user;
        this.password = password;
    }

    static public void execute(CommandLine cmd) {
        PgsqlSchemaTool instance = new PgsqlSchemaTool(cmd.getOptionValue("ip"), cmd.getOptionValue("port"),
                cmd.getOptionValue("u"), cmd.getOptionValue("p"));

        String action = cmd.getOptionValue("d");

        if (action.equals("init")) {
            instance.createDatabase();
        }
    }

    private boolean testSchema(String url, String user, String password){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            connection.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    private void createDatabase() {
        String name = "chorusdb"; //todo

        try (DSLContext dsl = DSL.using(DriverManager.getConnection(String.format("jdbc:postgresql://%s:%s/postgres", ip, port), user, password), SQLDialect.POSTGRES)) {
            System.out.println("Connect to db successfully");

            try {
                System.out.println("firstly, drop ailysisdb if exist ...");
                dsl.execute("drop db "+name);
            } catch (DataAccessException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("now, start to createClass db ...");
            dsl.execute(String.format("CREATE DATABASE %s OWNER %s;", name, user)); // todo
            System.out.println("Create DB done!");
        } catch (Exception e) {
            System.out.println(String.format("createClass db failed : %s", e.getMessage()));
        }

        try (DSLContext dsl = DSL.using(DriverManager.getConnection(String.format("jdbc:postgresql://%s:%s/%s", ip, port, name), user, password), SQLDialect.POSTGRES)) {
            System.out.println("Start to createClass tables ...");
            Resource resource = new PathMatchingResourcePatternResolver().getResource("classpath:schema/chorus_tables.sql");
            BufferedReader reader = new BufferedReader(new FileReader(resource.getFile()));//new File("src/main/resources/schema/ailysis.sql")
            String sql = reader.lines()
                    .filter(l -> !(l.isEmpty() || l.toUpperCase().contains("DROP")))
                    .map(l-> l.split("--")[0])
                    .reduce("", (a, b)-> a+b);

            String[] sqls = sql.split(";");
            dsl.batch(sqls).execute();

            System.out.println("Create tables done!");
        } catch (Exception e) {
            System.out.println(String.format("createClass tables failed : %s", e.getClass().getSimpleName()));
        }
    }
}
