package week1.day2;

public class ArmstrongNum {

	
	public static void main(String[] args) {
		
		
		int input = 153;
		
		int sum, rem, oriNum;
		sum= 0;
		
		oriNum=input;
		
		while (input>0) {
			
			 rem= input %10;
			 sum = sum + (rem*rem*rem);
			 input= input/10;
		}
		
		if (oriNum == sum) {
			System.out.println(oriNum +" is a Armstong number ");
		}
		else {
			System.out.println(oriNum +" not a Armstong number ");	
		}
	}
	
}

