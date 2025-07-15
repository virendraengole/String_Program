package org.evolveware;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    findLongestRepeatingSubstring("ABCXYABCDYZ");


    }

    public static String findLongestRepeatingSubstring(String  str) {
        int n = str.length();
        String longest = "";

        String input = str; //"ABCXYABCDYZ";

        String current = "";

        for (int i = 0; i < input.length(); i++) {

            System.out.println(input.charAt(i) );
            if(!current.isEmpty()) {
                System.out.println(current.charAt(current.length() - 1) + 1);
            }
            if (current.isEmpty() || input.charAt(i) == current.charAt(current.length() - 1) + 1) {


                current += input.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + input.charAt(i);
            }
        }

        // Final check after loop
        if (current.length() > longest.length()) {
            longest = current;
        }

        System.out.println("Longest alphabetical sequence: " + longest);

        return longest;
    }
}