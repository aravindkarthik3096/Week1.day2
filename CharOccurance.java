package week1.day2.classroom.string;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int count=0;
		
		char[] charArray = str.toCharArray();
		
		System.out.println(charArray.length);
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] == 'e') {
				count++;
			}
		}
		System.out.println("The number of times character 'e occurs in the given string = " + count);
	}
}
	
	

