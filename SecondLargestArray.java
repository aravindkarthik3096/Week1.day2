package week1.day2;

import java.util.Arrays;

import io.cucumber.java.it.Data;

public class SecondLargestArray {

	public static void main(String[] args) {
		
		int arrdata[] = {44,67,23,78,88};	
		
		Arrays.sort(arrdata);
		
		
		System.out.println(arrdata[arrdata.length-2]);
		
		
		
	}
	
}
