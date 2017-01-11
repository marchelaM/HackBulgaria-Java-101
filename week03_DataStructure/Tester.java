package week03_DataStructure;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		int result = 1;
		int index = 4;
		try {
			int[] nums = { 1, 5, 8, 10, 0, 5 , 0};
			for (int i = 0; i < nums.length; i++) {
				nums[index] = 1;
				result *= nums[i];
			}
		} catch (Exception NullPointerException) {
			System.out.println("Stop");
		}
		

		System.out.println(result);

	}
/*
	public int calculate(int index) {
	
	int result = 1;
	
	return result;

	}*/

}
