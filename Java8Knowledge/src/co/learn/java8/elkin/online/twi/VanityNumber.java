package co.learn.java8.elkin.online.twi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VanityNumber {

	public static void main(final String[] args) {
		final List<String> codes = new ArrayList<>();
		codes.add("HOLA");
		codes.add("ABCABC");
		
		final List<String> numbers = new ArrayList<>();
		numbers.add("+17474824338");
		numbers.add("+11111111111");
		numbers.add("+22222222222");
		numbers.add("+55555555555");
		numbers.add("+44652999999");

		final List<String> varityList = vanity(codes, numbers);
		varityList.forEach(varity -> System.out.println(varity));
	}

	private static List<String> vanity(final List<String> codes, final List<String> numbers) {
		
		List<String> codesAsNumbers = new ArrayList<>();
		codesAsNumbers = translateCodesToNumbers(codes, codesAsNumbers);
		List<String> finalList = new ArrayList<>(); 
		finalList = deleteDuplicates(numbers, finalList, codesAsNumbers);

		return finalList.stream().sorted().collect(Collectors.toList());

	}

	private static List<String> deleteDuplicates(List<String> numbers, List<String> finalList, List<String> codesAsNumbers) {
		for (String number : numbers) {
			for (String code : codesAsNumbers) {
				if (number.contains(code) && !finalList.contains(number)) {
					finalList.add(number);
				}
			}
		}
		return finalList;
	}

	private static List<String> translateCodesToNumbers(List<String> codes, List<String> codeAsNumbers) {
		
		for (String code : codes) {
			String codeAsNumber = "";
			for (int i = 0; i < code.length(); i++) {
				if (code.charAt(i) == 'A' || code.charAt(i) == 'B' || code.charAt(i) == 'C') {
					codeAsNumber = codeAsNumber.concat("2");
				} else if (code.charAt(i) == 'D' || code.charAt(i) == 'E' || code.charAt(i) == 'F') {
					codeAsNumber = codeAsNumber.concat("3");
				} else if (code.charAt(i) == 'G' || code.charAt(i) == 'H' || code.charAt(i) == 'I') {
					codeAsNumber = codeAsNumber.concat("4");
				} else if (code.charAt(i) == 'J' || code.charAt(i) == 'K' || code.charAt(i) == 'L') {
					codeAsNumber = codeAsNumber.concat("5");
				} else if (code.charAt(i) == 'M' || code.charAt(i) == 'N' || code.charAt(i) == 'O') {
					codeAsNumber = codeAsNumber.concat("6");
				} else if (code.charAt(i) == 'P' || code.charAt(i) == 'Q' || code.charAt(i) == 'R' || code.charAt(i) == 'S') {
					codeAsNumber = codeAsNumber.concat("7");
				} else if (code.charAt(i) == 'T' || code.charAt(i) == 'U' || code.charAt(i) == 'V') {
					codeAsNumber = codeAsNumber.concat("8");
				} else {
					codeAsNumber = codeAsNumber.concat("9");
				}
			}
			codeAsNumbers.add(codeAsNumber);
		}
		
		return codeAsNumbers;
	}

}
