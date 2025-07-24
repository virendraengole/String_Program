

import java.util.*;

public class Test5
{
	public static void main(String[] args) {
		System.out.println("Please Enter String");
		Scanner sc = new Scanner(System.in);
	 //withot java 8
	    String s = sc.nextLine();
		StringBuilder compressed = new StringBuilder();
		s = s.toLowerCase().replaceAll(" ", "").trim();
        ArrayList<Character> alphabetList = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetList.add(c);
        }
        char currentChar= s.charAt(0);
        int count =0;
        for(char c : s.toCharArray()) {
            if(alphabetList.contains(c) && (currentChar == c)) {
              count++;
            } else {
               
                compressed.append(currentChar).append(count);
                count=1;
                currentChar = c;
            }
        }
        
        compressed.append(currentChar).append(count);
        System.out.println(compressed);
        System.out.println();
        //with java 8
	    int count = 1;	
		for(int i = 1; i < s.length(); i++) {
		    if(s.charAt(i) == s.charAt(i-1)) {
		        count++;
		    } else {
		        compressed.append(s.charAt(i-1)).append(count);
		        count = 1;
		    }
		}
		
        compressed.append(s.charAt(s.length()-1)).append(count);

		System.out.println(compressed);
	    	
		
		
		
	}
}
