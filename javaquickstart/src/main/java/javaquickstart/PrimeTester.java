package javaquickstart;

import java.util.Scanner;

public class PrimeTester {
	
	public static void main(String args[]) {
		System.out.println("Enter the number to check whether it is prime or not: "); 
		int number = new Scanner(System.in).nextInt();
		//System.out.println(Math.sqrt(2));
		System.out.println(checkPrimeOrNot(number));
	}

	static boolean checkPrimeOrNot(int number) {
		int sqrt = (int) Math.sqrt(number);
		for(int i =2; i < sqrt +1; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
