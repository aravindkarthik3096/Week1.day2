package week1.day2.assigments.mandatory;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		
		String name1 = "madam";
		String rev = "";
		char ch;
		
		for (int i = 0; i < name1.length(); i++) {
			 ch = name1.charAt(i);
			rev= ch + rev;
		}
		System.out.println(rev);	
		if (name1.equals(rev)) {
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
}
