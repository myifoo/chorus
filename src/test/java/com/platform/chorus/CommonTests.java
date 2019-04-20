package com.platform.chorus;

import org.junit.Test;

public class CommonTests {

    @Test
    public void stringTest() {
        String a = "a.b.b.b";
        System.out.println(String.join(" ", a.split("\\.")));
    }
}
