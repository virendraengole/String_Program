import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sound.midi.Soundbank;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
public class Test {  
	//How do you count the number of occurrences of each character in a string?
	//		Given a string , you have to count the number of occurrences of each character in it. 
	//For example, If “Java J2EE Java JSP J2EE” is the given string then occurrences of 
	//each character in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5.
			 
			public static void main(String[] args) {
			        String s ="Java J2EE Java JSP J2EE";
			        s = s.replaceAll(" ", "");
			        System.out.println("full string = "+s);
			        Map<Character,Integer> m = new LinkedHashMap();
			        for(Character c : s.toCharArray()){
			          // System.out.println("Char = "+c);
			           if(m.containsKey(c)) {
			               m.put(c,m.get(c)+1);
			           } else {
			               m.put(c,1);
			           }
			        }
			        for(Map.Entry<Character,Integer> ec : m.entrySet()) {
			           System.out.println("Character Of = "+ec.getKey()+ " Char Count = "+ec.getValue()); 
			        }
			    }

	
	}
class Main {
    public static void main(String[] args) {
        String s = "Java J2EE Java JSP J2EE";
        int[] n = new int[256];
        for(int i = 0; i< s.length(); i++) {
            if(' ' != s.charAt(i)) {
                n[s.charAt(i)]++;
            }
        }
        for(int j = 0 ; j < 256; j++) {
            if(n[j] > 0) {
                System.out.println((char)j+" char count "+n[j]);
            }
        }
    }
}
