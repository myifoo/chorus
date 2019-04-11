package com.platform.chorus;

import com.platform.chorus.database.utils.PgsqlSchemaTool;
import org.apache.commons.cli.*;
import org.springframework.beans.BeansException;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.lang.Nullable;

import java.util.Map;
import java.util.Objects;

/**
 *
 *  <p> Class Description </p>
 *
 *      Server Author A.T
 *
 *  @version 1.0 2018/11/06 A.T
 *
 */
@SpringBootApplication
public class ChorusServerApplication implements ApplicationContextAware
{
	//    private static Logger logger = LoggerFactory.getLogger(Server.class);
	private static ApplicationContext context;
	private static SpringApplication application;
	private static Environment environment;
	private static CommandLine cmd;

	static private void printHelpMessage() {
		StringBuilder usage = new StringBuilder();
		String spaces = "        ";
		usage.append("\n")
				.append("Usage   : java -jar ailysis-master-1.0-SNAPSHOT.jar [options] [args...]\n")
				.append("Example : java -jar ailysis-master-1.0-SNAPSHOT.jar -d init -u ailysis -p ailysis123 -ip localhost -port 5432 \n")
				.append("\n\n")
				.append(spaces).append("-h -help       :  Print this usage information\n")
				.append(spaces).append("-m -mode       :  Server mode, such as [ web, test, all ]\n")
				.append(spaces).append("-d -db         :  database command line tools, such as [ init, clear, refresh, migrate]\n")
				.append(spaces).append("-u             :  database username, required when execute db command\n")
				.append(spaces).append("-p             :  database password, required when execute db command\n")
				.append(spaces).append("-ip            :  database ip, required when execute db command\n")
				.append(spaces).append("-port          :  database port, required when execute db command\n");

		System.out.println(usage.toString());
		System.exit(0);
	}

	public static void main( String[] args )
	{
		CommandLineParser parser = new DefaultParser();
		Options options = new Options();

		options.addOption("h", "help", false, "Print usage information");
		options.addOption("m", "mode", true, "Server mode: [ model, test, all ]");
		options.addOption("d", "db", true, "database command line tools: [ init, clear, refresh, migrate]");
		options.addOption("u", "username", true, "database username");
		options.addOption("p", "password", true, "database password");
		options.addOption("ip", true, "database ip");
		options.addOption("port", true, "database port");

		try {
			cmd = parser.parse(options, args);
		} catch (ParseException e) {
			printHelpMessage();
			exit(1);
		}
		if (cmd.hasOption("h")){
			printHelpMessage();
			exit(0);
		}

		if (cmd.hasOption("d")){
			PgsqlSchemaTool.execute(cmd);
			exit(0);
		}

		application = new SpringApplication(ChorusServerApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
		environment = applicationContext.getEnvironment();
	}

	static public void exit(int code) {
		System.exit(code);
	}

	public static boolean isTestMode() {
		String mode = cmd.getOptionValue("m");

		if (isWebOnlyMode() || Objects.nonNull(mode) && "test".equals(mode)) {
			return true;
		}

		return false;
	}

	public static boolean isWebOnlyMode() {
		String mode = cmd.getOptionValue("m");

		if (Objects.nonNull(mode) && "web".equals(mode)) {
			return true;
		}
		return false;
	}
}
