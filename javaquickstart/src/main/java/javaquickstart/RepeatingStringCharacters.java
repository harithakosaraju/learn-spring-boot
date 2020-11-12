package javaquickstart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingStringCharacters {
	
	public static void main(String args[]) {
		System.out.println("Enter the String for which we should find repeating characters..");
		String str = new Scanner(System.in).next();
		
		repeatCheck(str).forEach((k,v) -> {
			if(v >1) {
				System.out.println("Key..."+k+"  Value..."+v);
			}
		});
		
		
	}
	
	static Map<Character, Integer> repeatCheck(String str) {
		Map<Character, Integer> newString = new HashMap<Character, Integer> ();
		
		for(int i=0; i< str.length(); i++) {
			if(newString.containsKey(str.charAt(i))) {
				newString.put(str.charAt(i), newString.get(str.charAt(i))+1);
			} else {
				newString.put(str.charAt(i), 1);
			}
		}
		return newString;
	}

}
