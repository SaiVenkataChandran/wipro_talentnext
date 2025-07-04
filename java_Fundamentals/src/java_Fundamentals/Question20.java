package java_Fundamentals;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = reverse(num);
		if(res == num) {
			System.out.println(num + " is a Palindrome");
		}else {
			System.out.println(num + " is not a Palindrome");
		}
		

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
