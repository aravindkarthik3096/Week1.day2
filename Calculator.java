package week1.day2;

public class Calculator {

	public int addition(int num1, int num2) {
		return num1+num2;
	}
	public double subtraction(double num1, double num2) {
			return num1-num2;
		}
		
	public double multiplication(double num1, double num2) {
		return num1*num2;
	}
	public int division(int num1, int num2) {
		return num1/num2;
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int addresult =    cal.addition(250, 125);
		double subresult = cal.subtraction(30.05, 26.95);
		double mulresult =  cal.multiplication(29.45, 2.05);
		int divresult = cal.division(725, 5);
		
		System.out.println(addresult);
		System.out.println(subresult);
		System.out.println(mulresult);
		System.out.println(divresult);
	}
	}
	
	

