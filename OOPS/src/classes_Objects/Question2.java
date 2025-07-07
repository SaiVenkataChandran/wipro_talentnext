package classes_Objects;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int res1 = Calculator.powerInt(num1,num2);
		double res2 = Calculator.powerDouble(num1,num2);
		System.out.println("Value: " + res1);
		System.out.println("Value: " + res2);
	}
}

class Calculator{
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, double num2) {
		return  Math.pow(num1, num2);
	}
	
}