package java_Fundamentals;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = sumOfDigits(num);
		System.out.println(res);

	}
	
	static int sumOfDigits(int num) {
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum += rem;
			num = num/10;
		}
		return sum;
	}

}
