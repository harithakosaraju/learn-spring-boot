package javaquickstart;

import java.util.Scanner;

public class ReverseSentenceWords {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the sentence which has to be reversed");
		String str = "Jack and Jill went up the hill";
		System.out.println("Reversed String .."+reverse(str));
		
	}
	
	static String reverse(String str) {
		String[] words = str.split("\\s");
		String reverse = "";
		for(int i=words.length-1; i >= 0; i--) {
			reverse = reverse + words[i] + " ";
		}
		return reverse;
	}

}
