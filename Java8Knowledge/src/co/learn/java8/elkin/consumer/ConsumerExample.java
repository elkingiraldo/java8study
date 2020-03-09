package co.learn.java8.elkin.consumer;

import java.util.function.Consumer;

public class ConsumerExample { // Consumer is a functional interface

	public static void main(String[] args) {
		
		// Never primitive inside 
		Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
		// con1.accept("java8");
		
		Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
		//con2.accept("java8");

		// It's up to me to add a string of "andThen" that we want to use
		con1.andThen(con2).accept("Java8");;
		
	}
	
}
