package co.learn.java8.elkin.spotify;

import java.util.Objects;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(Objects.isNull(INSTANCE)) {
            System.out.println("First call");
            INSTANCE = new Singleton();
        }

        System.out.println("Other call");
        return INSTANCE;
    }
}
