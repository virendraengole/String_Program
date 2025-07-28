
import java.util.*;
public class Test6
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Palindrome word");
	    String input =  sc.nextLine();
		String output = "";
		//way 1st
		for(int i = input.length()-1; i >= 0 ; i--) {
		    output = output + input.charAt(i);
		}
		if(input.equalsIgnoreCase(output)) {
		    System.out.println("It's a palindrome");
		} else {
		    System.out.println("It's a not palindrome");
		}
		//way 2nd
        String reversed = new StringBuilder(input).reverse().toString();
        if(input.equalsIgnoreCase(reversed)) {
		    System.out.println("It's a palindrome");
		} else {
		    System.out.println("It's a not palindrome");
		}
		
		sc.close();
	}
}