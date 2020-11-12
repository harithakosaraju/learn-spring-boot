package javaquickstart;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveArrayDuplicates {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(11,22,54,11,76,90,30,90,43,24,11,76,49);
		removeDuplicates(list).stream().forEach(System.out::println);
	}
	
	static Set removeDuplicates(List<Integer> list) {
		Set<Integer> newList = new HashSet<Integer>();
		list.stream().forEach(e -> newList.add(e));
		return newList;
	}

}
