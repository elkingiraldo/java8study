package co.learn.java8.elkin.online.twi;

import java.util.ArrayList;
import java.util.List;

public class SMSSplitting {

	private static final String FINAL_OF_SEGMENT = "(%d/%d)";

	public static void main(final String[] args) {

//		final String message = "";
//		final String message = "hola mundo";
//		final String message = "Hola como estas esto es un test para saber que tan bn funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saber QUE tan bien esta haciendo la perticion de los mensajes";
//		final String message = "Hola como estas esto es un test para saber que tan bn funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saber que tantisi";
//		final String message = "  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saber que tan";
//		final String message = "  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saber que ta holi";
//		final String message = "  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test";
//		final String message = "01  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 02  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 03  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 04  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 05  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 06  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 07  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 08  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test ";
//		final String message = "01  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 02  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 03  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 04  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 05  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 06  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 07  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 08  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test lalalalalla lelelelelel lililililililili lolololololo lulululu";
		final String message = "01  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 02  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 03  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 04  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 05  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 06  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 07  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 08  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test lalalalalla lelelelelel lililililililili lolololololo lulululu01  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 02  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test 03  Hola como estas esto es un test para saber que tan bn   funciona el programa no estoy seguro si vaya a funcionar o no pero solo es porque quiero saberlo  holi test ";
		
		final List<String> segments = simpleSegments(message);

		if (segments.size() > 1) {
			autoCompleteSegments(segments);
		}
		if (segments.size() > 9) {
			segments.subList(9, segments.size()).clear();
		}

		segments.forEach(segment -> System.out.println(segment));

	}

	private static List<String> simpleSegments(final String message) {

		final List<String> finalList = new ArrayList<>();

		if (message.length() <= 160) {
			finalList.add(message);
			return finalList;
		}

		final int initialCharPosition = 0;
		final int initialWordInSplit = 0;
		final String[] words = message.split(" ");
		// List<String> words = Arrays.asList(message.split(" "));

		return iterateSegments(message, finalList, initialCharPosition, initialWordInSplit, words);
	}

	private static List<String> iterateSegments(final String message, final List<String> finalList,
			final int initialCharPosition, int initialWordInSplit, final String[] words) {

		if (message.length() - initialCharPosition <= 155) {
			final String lastPartOfMessage = message.substring(initialCharPosition);
			finalList.add(lastPartOfMessage);
			return finalList;
		}

		String segment = "";
		final int untilFor = message.length() > initialCharPosition + 160 ? initialCharPosition + 160
				: message.length();

		for (int i = initialCharPosition; i < untilFor; i++) {
			if (Character.isWhitespace(message.charAt(i)) && segment.length() < 155) {
				segment += message.charAt(i);
			} else if (!Character.isWhitespace(message.charAt(i))
					&& (segment.length() + words[initialWordInSplit].length()) < 156) {
				segment += words[initialWordInSplit];
				i += words[initialWordInSplit].length() - 1;
				initialWordInSplit++;
			} else {
				finalList.add(segment);
				iterateSegments(message, finalList, i, initialWordInSplit, words);
				break;
			}
		}

		return finalList;
	}
	
	private static void autoCompleteSegments(final List<String> segments) {
		final int numberOfSegments = segments.size() > 9 ? 9 : segments.size();

		for (int i = 0; i < numberOfSegments; i++) {
			segments.set(i, segments.get(i).concat(String.format(FINAL_OF_SEGMENT, i + 1, numberOfSegments)));
		}
	}

}
