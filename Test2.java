import java.util.Scanner;


public class Test2 {
	public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string : ");
	        String s = sc.nextLine();
	        m1(s);
	        }
	    public static void m1(String s) {
	        //First way
	         /*String[] m = s.split(" ");
	        s = "";
	        for(int i= 0; i < m.length; i++) {
	            s = s + m[i]; 
	        }*/
	        //secound way
	        /*char[] m = s.toCharArray();
	        s = "";
	        for(int i = 0 ; i < m.length; i++) {
	            if(' ' != m[i]) {
	               s = s + m[i]; 
	            }
	        }*/
	        //Third Way
	        System.out.println("after remove space : "+s.replaceAll(" ",""));
	}
}




