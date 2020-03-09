package co.learn.java8.elkin;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

public class Java7VsJava8Example {
	
	public static void main(String[] args) {
		
		// Before Sum Numbers
		Instant startTime = Instant.now();
		
		int total = 0;
		long NUMBER_OF_ITERATION = 500000000L;
		for (int i = 0; i < NUMBER_OF_ITERATION; i++) {
			total += i;
		}
		
		Instant endTime = Instant.now();
		long duration = Duration.between(startTime, endTime).toMillis();
		
		System.out.println("Total: " + total + " in " + duration + " milliseconds");
		
		//Java 8
		Instant start = Instant.now();
		
		long total2 = LongStream.rangeClosed(0, NUMBER_OF_ITERATION)
						.map(Long :: new)
						.sum();
		
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();
		
		System.out.println("Total2: " + total2 + " in " + timeElapsed + " milliseconds");
		
	}

}
