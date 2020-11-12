package javaquickstart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FibonacciCalculator {
	
	public static void main(String args[]) {
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		int number = new Scanner(System.in).nextInt();
		
		System.out.println(Arrays.toString(calculate(number).toArray()));

		
	}

	static int add(int number, int f1, int f2) {
		if((number ==1) || (number==2))
			return 1;
		if(number == 3) {
			return 2;
		} else {
			return f1 +f2;
			}
		
	}
	
	static List<Integer> calculate(int number) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= number; i++) {
			int f1 = 0;
			int f2 =0;
			if(i>3) {
				f1 = (Integer) list.get(i-2);
				f2 = (Integer) list.get(i-3);
			}
			list.add(add(i,f1, f2));	
		}
		return list;
	}
}
