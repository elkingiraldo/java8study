package co.learn.java8.elkin.spotify;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(buildPalindrome("bac", "baczzzzzazzzaz"));
        //System.out.println(buildPalindrome("abc", "def"));
        //System.out.println(buildPalindrome("jdfh", "fds"));
    }

    private static String buildPalindrome(String a, String b) {
        int sizeA = a.length();
        int sizeB = b.length();

        for (int i = 0; i < sizeA; i++) {
            char charA = a.charAt(i);
            String stringOfCharA = String.valueOf(charA);

            if (b.contains(stringOfCharA)) {
                System.out.println("I'm in the condition for char: " + stringOfCharA);
                System.out.println("Firts index: " + b.indexOf(stringOfCharA));
                System.out.println("Last index: " + b.lastIndexOf(stringOfCharA));
            }
        }

        return "some result";
    }
}
