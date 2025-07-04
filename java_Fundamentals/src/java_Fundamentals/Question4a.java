package java_Fundamentals;

import java.util.Scanner;

public class Question4a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = (num < 0)?"Negative":(num > 0)?"Positive":"Zero";
		System.out.println(res);

	}

}
