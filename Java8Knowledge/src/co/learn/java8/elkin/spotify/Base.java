package co.learn.java8.elkin.spotify;

import java.util.Arrays;
import java.util.List;

public class Base {

    private static final String SPACE = " ";

    public static void main(String[] args) {
        Singleton.getInstance();
        Singleton.getInstance();
        Singleton.getInstance();

        List<String> greeting = Arrays.asList("hello", "world");
        System.out.println(helloWorld(greeting));
    }

    private static String helloWorld(List<String> greeting) {
        return String.join(SPACE, greeting);
    }
}
