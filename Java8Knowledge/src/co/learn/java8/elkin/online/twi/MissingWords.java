package co.learn.java8.elkin.online.twi;

import java.util.ArrayList;
import java.util.List;

public class MissingWords {

	public static void main(final String[] args) {

		final String s = "I like my car because it's beautiful and good";
		final String substring = "like my because beautiful";

		final List<String> missingWords = missingWords(s, substring);
		missingWords.forEach(word -> System.out.println(word));

	}

	private static List<String> missingWords(final String s, final String substring) {

		final String[] splitString = s.split(" ");
		final String[] splitsub = substring.split(" ");

		final List<String> finalList = new ArrayList<>();

		for (int i = 0, subPosition = 0; i < splitString.length; i++) {
			if (!splitString[i].equals(splitsub[subPosition])) {
				finalList.add(splitString[i]);
			} else {
				if (subPosition < splitsub.length - 1) {
					subPosition++;
				}
			}
		}

		return finalList;
	}

}
