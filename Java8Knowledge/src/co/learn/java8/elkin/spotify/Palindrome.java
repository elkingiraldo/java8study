package co.learn.java8.elkin.spotify;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(buildPalindrome2("jdfh", "fds"));
        //System.out.println(buildPalindrome("abc", "def"));
        //System.out.println(buildPalindrome("jdfh", "fds"));
    }

    private static String buildPalindrome(String a, String b) {
        int sizeA = a.length();
        int sizeB = b.length();

        List<String> palindromes = new ArrayList();

        for (int i = 0; i < sizeA; i++) {
            char charA = a.charAt(i);
            String stringOfCharA = String.valueOf(charA);

            if (b.contains(stringOfCharA)) {
                int lastIndexB = b.lastIndexOf(stringOfCharA);

                StringBuilder left = new StringBuilder("");
                left.append(stringOfCharA);

                Stack<String> right = new Stack<>();
                right.push(String.valueOf(b.charAt(lastIndexB)));


                for (int j = i + 1, k = lastIndexB - 1; j < sizeA && k >= 0; j++, k--) {
                    if (a.charAt(j) == b.charAt(k)) {
                        left.append(a.charAt(j));
                        right.push(String.valueOf(b.charAt(k)));
                    } else {
                        if (a.charAt(j) < b.charAt(k)) {
                            left.append(a.charAt(j));
                        } else {
                            right.push(String.valueOf(b.charAt(k)));
                        }

                        break;
                    }
                }

                for (int l = 0; l <= right.size(); l++) {
                    left.append(right.pop());
                }

                palindromes.add(left.toString());
            }
        }

        palindromes.forEach(s -> System.out.println(s));

        String longest = palindromes.stream().
                max(Comparator.comparingInt(String::length)).get();

        System.out.println("Elkin: " + longest);

        return "some result";
    }

    private static String buildPalindrome2(String a, String b) {
        int sizeA = a.length();
        int sizeB = b.length();

        List<String> palindromes = new ArrayList();

        for (int i = 0; i < sizeA; i++) {
            char charA = a.charAt(i);
            String stringOfCharA = String.valueOf(charA);

            if (b.contains(stringOfCharA)) {
                int lastIndexB = b.lastIndexOf(stringOfCharA);

                StringBuilder left = new StringBuilder("");
                left.append(stringOfCharA);

                Stack<String> right = new Stack<>();
                right.push(String.valueOf(b.charAt(lastIndexB)));

                for (int j = i + 1, k = lastIndexB - 1; j < sizeA || k >= 0; j++, k--) {
                    System.out.println("a.charAt(j) -> " + a.charAt(j));
                    System.out.println("b.charAt(k) -> " + b.charAt(k));

                    if (a.charAt(j) == b.charAt(k)) {
                        left.append(a.charAt(j));
                        right.push(String.valueOf(b.charAt(k)));
                    } else {
                        if (a.charAt(j) < b.charAt(k)) {
                            left.append(a.charAt(j));
                        } else {
                            right.push(String.valueOf(b.charAt(k)));
                        }

                        break;
                    }
                }

                for (int l = 0; l <= right.size(); l++) {
                    left.append(right.pop());
                }

                palindromes.add(left.toString());
            }
        }

        palindromes.forEach(s -> System.out.println(s));

        String longest = palindromes.stream().
                max(Comparator.comparingInt(String::length)).get();

        System.out.println("Elkin: " + longest);

        return "some result";
    }
}
