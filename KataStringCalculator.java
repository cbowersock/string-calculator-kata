package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataStringCalculator {
	
	public int add(String number) {		
		List<Integer> ints = new ArrayList<Integer>(); 
		String[] nums;
		
		if (number.equals("")) {
			return 0;
		}
		
		if (number.length() > 1) {
			
			if (number.startsWith("//")) {
				String delim = Character.toString(number.charAt(2));
				number = number.substring(4);
				nums = number.split(delim);
			} else {
				nums = number.split(",|\\\n");
			}
			
			for (int i = 0; i < nums.length; i++) {
				ints.add(Integer.parseInt(nums[i]));
			}
			
			int sum = 0;
			for (Integer x : ints) {
				sum = sum + x;
			}
			return sum;
		}
		
		return Integer.parseInt(number);
	}

}
