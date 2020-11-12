package javaquickstart;

import java.util.Scanner;

public class FactorialTester {
	
	public static void main(String args[]) {
		System.out.println("Enter the number to find factorial");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Factorial .."+findFactorial(number));
		System.out.println(factorial(3));
	}
	
	static int findFactorial(int number) {
		int factorial=1;
		for(int i= number; i > 0; i--) {
			factorial = factorial*i;
		}
		return factorial;
	}
	
	static int factorial(int number) {
		
		if(number ==0) {
			return 1;
		}
		return number*factorial(number-1);		
	}

}
