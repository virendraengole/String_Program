
import java.util.Scanner;

//How do you find duplicate characters in a string?
public class Test {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        m1(s);
        }
    public static void m1(String s) {
        int[] n = new int[256];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                n[s.charAt(i)]++;
            }
        }
        for(int j = 0; j < n.length; j++) {
            if(n[j] > 0) {
            System.out.println((char) j + " char of duplicate " +n[j]);
            }
        }
    }

}
