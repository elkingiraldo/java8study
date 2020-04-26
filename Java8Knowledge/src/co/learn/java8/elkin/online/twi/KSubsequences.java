package co.learn.java8.elkin.online.twi;

import java.util.ArrayList;
import java.util.List;

public class KSubsequences {

	public static void main(final String[] args) {
		final List<Integer> nums = new ArrayList<>();
		final int k = 0;
		final long kSub = kSub(k, nums);

		System.out.println("The long is: " + kSub);
	}

	private static long kSub(final int k, final List<Integer> nums) {
		return 1L;
	}

}
