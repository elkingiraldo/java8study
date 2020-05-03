package co.learn.java8.elkin.online.twi;

import java.util.Arrays;
import java.util.List;

public class KSubsequences {

	public static void main(final String[] args) {
		final List<Integer> nums = Arrays.asList(3, 5, 1, 2, 3, 4, 1);
		final int k = 3;
//		final List<Integer> nums = Arrays.asList(5, 10, 11, 9, 5);
//		final int k = 5;
		final long kSub = kSub(k, nums);

		System.out.println("The long is: " + kSub);
	}
	
	private static long kSub(final int k, final List<Integer> nums) {

		long subSequenceNumber = 0;

		for (int i = 0; i < nums.size(); i++) {
			int partial = 0;
			for (int j = i; j < nums.size(); j++) {
				partial += nums.get(j);				
				if (partial % k == 0) {
					subSequenceNumber++;
				}
			}
		}

		return subSequenceNumber;
	}

}
