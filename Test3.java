import java.util.Scanner;
import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Hello World");

		//First normal 
		String s1 = "Listen";
		String s2 = "Silent";
		int n1[] = new int[256];
		if (s1.length() != s2.length()) {
			System.out.println("Not anagram");
		} else {
			for (int i = 0; i < s1.length(); i++) {
				n1[s1.charAt(i)]++;
				n1[s1.charAt(i)]--;
			}
			int count = 0;
			for (int j = 0; j < 256; j++) {
				if (n1[j] > 0) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Not anagram");
			} else {
				System.out.println("Its Anagram");
			}
		}
		//Second using Arrays sort 
		String s5 = "Viru";
		String s6 = "urvi";

		char[] chArr = s5.toLowerCase().toCharArray();
		char[] chArr1 = s6.toLowerCase().toCharArray();
		Arrays.sort(chArr);
		Arrays.sort(chArr1);

		if (Arrays.equals(chArr, chArr1)) {
			System.out.println("Its Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
