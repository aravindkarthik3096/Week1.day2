package week1.day2.assigments.mandatory;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester"; 
		
			String[] split = test.split(" ");
			
			System.out.println(Arrays.toString(split));
			int length = split.length;
			System.out.println("Length of words = "+length);
			
			String value = "";
			for (int i = 0; i < split.length; i++) {
				if (i%2!=0) {
					value = value + new StringBuilder(split[i]).reverse().toString() + " ";
				}
				    else
				        value = value + split[i] + " ";
				}
			value = value.trim();
			System.out.println(value);
			}
		}
		

