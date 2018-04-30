package org.test.context;

public class Log {
    public static void log(String msg, Object... args) {
        System.out.println(">> " + String.format(msg, args));
    }
}
