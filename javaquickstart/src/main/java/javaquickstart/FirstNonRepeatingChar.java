package javaquickstart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
	static char valueArray[] = new char[256];
	
	
	public static void main(String args[]) {
		System.out.println("Enter the String...");
		String value = new Scanner(System.in).next();
		System.out.println("The first occurence character in the string: "+ check(value));
		
		check2(value);
	}
	
	static String check(String value) {
		Map<String, Integer> frequencyCount = new HashMap<String, Integer>();
		
		for(int i=0; i<value.length(); i++) {
			frequencyCount.put(String.valueOf(value.charAt(i)), frequencyCount.get(String.valueOf(value.charAt(i))) == null ? 1: frequencyCount.get(String.valueOf(value.charAt(i)))+1 );
		}
		
		for(int i=0; i<value.length(); i++) {
			if(frequencyCount.get(String.valueOf(value.charAt(i))) ==1) {
				return String.valueOf(value.charAt(i));
			}
		}
		return "";
	}
	
	static int check2(String value) {
		
 
	        for (int i = 0; i < value.length(); i++) 
	        	valueArray[value.charAt(i)]++;
		int index = -1, i; 
		  
        for (i = 0; i < value.length(); i++) { 
        	if (valueArray[value.charAt(i)] == 1) { 
                index = i; 
                break; 
            } 
        } 
  
        return index; 
	}

}
