import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

//find the closest value in the array to a given target by computing
public class Test2 {
	public static void main(String args[]) {
		
		
		//int[] intArray = {2, 3, 5, 9, 14};
		int[] intArray = {5, 3, 2, 14, 9};
		int target = 8;
		
		int smoll = 0;
		int large = 0;
		 Arrays.sort(intArray);
		int targetIstoSmoll = intArray[0];
		int targetIstoLarge = intArray[intArray.length - 1];
		
		for(int inta : intArray) {
			if(target >= inta ) {
				System.out.println("First inta  = "+inta);
				if(smoll == 0) {
					smoll = inta;
					} else {
				if(inta >= smoll ) {
					smoll = inta;
					}
				}
			}
			if(target <= inta) {
				System.out.println("Sec inta  = "+inta);
				if(large  == 0) {
					large = inta;
				} else {
					if(inta <= large) {
						large = inta;
					}
				}
			}
			
		}
		System.out.println("smoll "+ smoll);
		System.out.println("large "+large);
		int value = (smoll <= 0) ? targetIstoSmoll : (large <= 0) ? targetIstoLarge : 0;
		if(value > 0) {
		System.out.println(value);
		}
		if(smoll !=  0 && large != 0) {
			int smollTarget = target  - smoll;
			int largeTaget = large - target;
		
			if(smollTarget >= largeTaget) {
				System.out.println(target+" ------------- closest --------------- "+large);
			} else {
				System.out.println(target+" ------------- closest --------------- "+smoll);
			}
		}
	
	
		Integer closest = null;
		int bestDiff = Integer.MAX_VALUE;
		for (int v : intArray) {
		    int diff = Math.abs(v - target);
		    if (diff < bestDiff || (diff == bestDiff && v < closest)) {
		        bestDiff = diff;
		        closest = v;
		    }
		}
			System.out.println(closest);
	
	
	}
	
	
	
	
	
}






