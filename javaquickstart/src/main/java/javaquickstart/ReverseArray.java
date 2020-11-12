package javaquickstart;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {
	
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Haritha", "Venkata", "Akhil", "Vaishnavi");
		System.out.println(reverse(names))
		;
		String[] array = {"Haritha", "Venkata", "Akhil", "Vaishnavi"};
		System.out.println(Arrays.toString(reverseArray(array)));
	}
	
	static List<String> reverse(List<String> names) {
		if(names == null || names.size() <2) {
			return names;
		}
		for(int i =0; i<names.size()/2;i++) {
			String temp = names.get(i);
			names.set(i, names.get((names.size() -1)-i));
			names.set(((names.size() -1)-i), temp);
		}
		return names;
	}
	
	static String[] reverseArray(String[] names) {
		for(int i =0; i<names.length/2;i++) {
			String temp = names[i];
			names[i] = names[(names.length-1) - i];
			names[((names.length) -1 )-i] = temp;
		}
		return names;
	}

}
