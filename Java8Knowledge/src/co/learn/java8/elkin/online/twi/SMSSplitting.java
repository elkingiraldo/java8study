package co.learn.java8.elkin.online.twi;

import java.util.ArrayList;
import java.util.List;

public class SMSSplitting {

	public static void main(final String[] args) {

		final String message = "";
		final List<String> segments = segments(message);

		segments.forEach(segment -> System.out.println(segment));

	}

	private static List<String> segments(final String message) {

		final List<String> finalList = new ArrayList<>();

		return finalList;

	}

}
