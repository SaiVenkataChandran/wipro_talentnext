package java_Fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = (num%2==0)?"Even":"Odd";
		System.out.println(res);

	}

}
