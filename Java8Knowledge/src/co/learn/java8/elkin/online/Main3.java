package co.learn.java8.elkin.online;

import java.util.Scanner;

public class Main3 {

	public static int RegenerateNumber(int N) {
		
		String nAsString = Integer.toString(N);
		int bigestNumber = bigestNumber(nAsString);
		int smallestNumber = smallestNumber(nAsString);
		
		System.out.println(bigestNumber);
		System.out.println(smallestNumber);
		
		return (bigestNumber - smallestNumber);
	}
	
	public static int bigestNumber(String number) {
		
		int result = 0;
		boolean allNumbersNine = true;
		
		for (int i = 0; i < number.length(); i++) {
			char singleDigit = number.charAt(i);
			if (singleDigit == '9') {
				continue;
			} else {
				allNumbersNine = false;
				result = replaceNumber(number, singleDigit, '9');
				break;
			}
		}
		
		if (allNumbersNine) {
			return replaceNumber(number, '9', '8');
		}
		
		return result;
	}
	
	public static int smallestNumber(String number) {
		
		int result = 0;
		boolean allNumbersZero = true;
		
		for (int i = 0; i < number.length(); i++) {
			char singleDigit = number.charAt(i);
			if (i == 0 && singleDigit == '1') {
				continue;
			} else if (i == 0 && singleDigit != '1') {
				return replaceNumber(number, singleDigit, '1');
			} else {
				if (singleDigit == '0') {
					continue;
				} else {
					allNumbersZero = false;
					result = replaceNumber(number, singleDigit, '0');
					break;
				}
			}
		}
		
		if (allNumbersZero) {
			return replaceNumber(number, '0', '1');
		}
		
		return result;
	}
	
	public static int replaceNumber(String number, char from, char to) {
		return Integer.valueOf(number.replace(from, to));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(RegenerateNumber(N));
	}
	
}
