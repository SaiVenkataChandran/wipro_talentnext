package java_Fundamentals;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean res = isPrime(num); 
		if(res) System.out.println("Prime");
		else System.out.println("Not Prime");

	}
	
	static boolean isPrime(int num) {
		int count = 0;
		if(num % 2 == 0) return false;
		for(int i=3;i<=Math.sqrt(num);i = i+2) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
