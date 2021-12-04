package week1.day2.classroom.arrays;

import java.util.Arrays;

public class ArrayDuplicates{

	public static void main(String[] args) {

		int[] arr1 = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		int length = arr1.length;
		System.out.println("length of array = "+length);
		
		for (int i = 0; i < arr1.length-1; i++) {
			
			for (int j = i+1; j < arr1.length; j++) {
				
				if (arr1[i]==arr1[j]) {
				System.out.println(arr1[j]);
				}
				
				}
			}
	}
}