package java_Fundamentals;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = reverse(num);
		System.out.println(res);
	}
	
	static int reverse(int num) {
		int res = 0;
		while(num != 0) {
			int rem = num%10;
			res = ( res * 10) + rem;
			num = num / 10;
		}
		return res;
	}

}
