package com.code;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1D array
		int num[]= {1,2,3,4};
		System.out.println(Arrays.toString(num));
		
		int nums[][]= {{1,2,3,4},{5,6,7,8}};
		System.out.println(nums[1][2]);
		String name="Vikas";
		String reverse ="";
		
		StringBuffer sb = new StringBuffer(String.valueOf(name)); 
		
		System.out.println(sb.reverse());
		
		
		for (int i =name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
			
			
		}
		System.out.println(reverse);
	}

}
