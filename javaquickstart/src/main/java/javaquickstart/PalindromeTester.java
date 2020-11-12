package javaquickstart;

import java.util.Scanner;

public class PalindromeTester {
	
	public static void main(String args[]) {
		System.out.println("Enter String to test if it is Palindrome or not "); 
		String value = new Scanner(System.in).next();
		System.out.println(isPalindrome(value));
	}

	static boolean isPalindrome(String value) {
		int length = value.length();
		String newString = "";
		for(int i=length; i > 0; i--) {
		   newString = newString+ value.charAt(i-1);
		}
		if(value.equals(newString)) {
			return true;
		} else  {
			return false;
		}
	}
}
