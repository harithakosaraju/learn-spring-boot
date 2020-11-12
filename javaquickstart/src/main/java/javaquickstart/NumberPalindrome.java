package javaquickstart;

import java.util.Scanner;

public class NumberPalindrome {
	
	public static void main(String args[]) {
		System.out.println("Enter number to test if it is Palindrome or not "); 
		int value = new Scanner(System.in).nextInt();
		System.out.println(isPalindrome(value));
	}
	
	static boolean isPalindrome(int number) {
		
		int r = number;
		int q = 0;
		String newNumber ="";
		
		while (r > 0) {
			q = r%10;
			r = r/10;			
			newNumber = newNumber + q;
		}
		if(String.valueOf(number).equals(newNumber)) {
			return true;
		} else {
			return false;
		}
	}
	

}
