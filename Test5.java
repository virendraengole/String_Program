

import java.util.*;

public class Test5
{
	public static void main(String[] args) {
		System.out.println("Please Enter String");
		Scanner sc = new Scanner(System.in);
	//	String s = 	"aabcccccaaa";
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
        
	    	
		
		
		
	}
}