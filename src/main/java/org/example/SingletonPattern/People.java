package org.example.SingletonPattern;

public class People {

    private static People instance;

    private People() {}

    public static People getInstance() {
        if (instance == null) {
            instance = new People();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}