package co.learn.java8.elkin;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java7VsJava8Example2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("hola", "como", "estas", "hola");
		
		// Before Sum Numbers
		Instant startTime = Instant.now();

		List<String> namesWithoutDuplicates = new ArrayList<>();
		for (String name : names) {
			if (!namesWithoutDuplicates.contains(name)) {
				namesWithoutDuplicates.add(name);
			}
		}

		Instant endTime = Instant.now();
		long duration = Duration.between(startTime, endTime).toMillis();

		System.out.println("Lista sin Duplicados: " + namesWithoutDuplicates + " in " + duration + " milliseconds");

		// Java 8
		Instant start = Instant.now();

		List<String> namesWithoutDuplicates2 = names.stream()
				.distinct()
				.collect(Collectors.toList());

		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis();

		System.out.println("Lista sin Duplicados 2: " + namesWithoutDuplicates2 + " in " + timeElapsed + " milliseconds");
	}

}
