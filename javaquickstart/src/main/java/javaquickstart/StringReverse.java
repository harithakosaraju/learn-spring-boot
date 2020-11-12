package javaquickstart;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String args[]) {
		System.out.println("Enter the string to reverse");
		String str = new Scanner(System.in).next();
		System.out.println("Reversed String.."+stringReverse(str));
	}
	
	static String stringReverse(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

}
