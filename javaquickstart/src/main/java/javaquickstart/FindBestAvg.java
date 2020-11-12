package javaquickstart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindBestAvg {
	
	public static Integer bestAverageGrade(String[][] scores) {

		Map<String, List<Float>> gradeAvg = new HashMap<String, List<Float>>();
		Map<String, Integer> bestAvg = new HashMap<String, Integer>();
		Integer bestAvgValue = Integer.MIN_VALUE;
		for(int j = 0; j < scores.length; j++) {
			String[] value = scores[j];	
		    if(gradeAvg.containsKey(value[0])) {	
		    	gradeAvg.get(value[0]).add(Float.valueOf(value[1]));
		    }
		    else {
		    	List<Float> l1 = new ArrayList<Float>();
		    	l1.add(Float.valueOf(value[1]));
		    	gradeAvg.put(value[0], l1);
		    }
		}
		if(gradeAvg.isEmpty())
			return 0;
		for(String value : gradeAvg.keySet()) {
			Float avgValue = (float) 0;
			if(gradeAvg.get(value).size() > 1) {
				for(Float i : gradeAvg.get(value)) {
					avgValue = avgValue + i;
				}
				Float f = avgValue/gradeAvg.get(value).size();
				
				//System.out.println("F="+f+"f%1="+f%f.intValue());
				if(f<0 && f%f.intValue() != 0)
					f--;
				bestAvg.put(value, f.intValue());
			} else {
				bestAvg.put(value, gradeAvg.get(value).get(0).intValue());
			}
		}
		for(String value : bestAvg.keySet()) {			
			if(bestAvg.get(value) > bestAvgValue) {
				bestAvgValue = bestAvg.get(value);			}			
		}
		
		//if(bestAvgValue <0 )
			//bestAvgValue--;
		
		//System.out.println(bestAvgValue);
		return bestAvgValue;
	}
	
	public static boolean doTestsPass(String args[]) {
		
		
		Map<String[][], Integer> testCases = new HashMap<>();
		
		testCases.put(new String[][] { {"Venkat", "87"}, {"Venkat", "-56"}, {"Haritha", "84"}, {"Akhil","67"} }, 84);
		testCases.put(new String[][] { }, 0);
		testCases.put(new String[][] { {"Venkat", "92"}, {"Vaishnavi", "92"}, {"Haritha", "92"}, {"Akhil","92"} }, 92);
		testCases.put(new String[][] { {"Venkat", "92"}, {"Haritha", "93"}, {"Haritha", "95"}, {"Venkat","94"}, {"Akhil","93"} }, 94);
		testCases.put(new String[][] { {"Venkat", "-66"}, {"Haritha", "-88"}, {"Haritha", "44"}, {"Akhil", "0"}, {"Venkat","0"}, {"Akhil","0"}, {"Akhil","-6"} }, -2);
		testCases.put(new String[][] { {"Venkat", "91"}, {"Venkat", "92"} }, 91);
		testCases.put(new String[][] { {"Venkat", "-66"}, {"Venkat", "-65"}, {"Haritha", "-122"} }, -66);

		boolean passed = true;
		for(Map.Entry<String[][], Integer> entry : testCases.entrySet()) {
			Integer actual = bestAverageGrade(entry.getKey());
			if(actual != entry.getValue()) {
				passed = false;
				System.out.println("Failed for " + Arrays.deepToString(entry.getKey()) + ", expected " + entry.getValue() + ", actual = " + actual);
			}
		}
		
		return passed;
	}
		
	public static void main(String args[]) {
		if(doTestsPass(args))
		{ 
			System.out.print("All tests pass");
		}
		String[] [] tc1 = { {"Venkat", "87"}, {"Venkat", "56"}, {"Haritha", "84"}, {"Akhil","67"} };
		bestAverageGrade(tc1);
	}

	
	
}
