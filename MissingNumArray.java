package week1.day2.assigments.mandatory;

import java.util.Arrays;

public class MissingNumArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		int i = 1;
		
		while (i<arr.length) {
			
			if (arr[i] - arr[i-1]==1) {
				
			}
			else {
				System.out.println("Missing number "+(arr[i-1]+1) );
			}
			i++;
			}
		
		}		
	}

