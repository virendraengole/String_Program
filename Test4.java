
import java.util.*;
public class Test4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please Enter String");
	    String s = sc.nextLine();
		 s = s.toLowerCase().replaceAll(" ", "");
		 
		 Map<Character, Integer> m  = new LinkedHashMap();
		 
		 for(Character c: s.toCharArray()) {
		     if(m.containsKey(c)) {
		         m.put(c,m.get(c)+1);
		     } else {
		         m.put(c,1);
		     }
		 }
		 int count =0;
		 for(Map.Entry<Character,Integer> ec : m.entrySet()) {
		     if(ec.getValue() == 1){
                count++;
                if(count == 2) {
                    System.out.println(ec.getKey() + " and "+ ec.getValue());  
                    break;
                }
             }
            
		 }
		 
		 //java have a jvm
		 
	}
}
