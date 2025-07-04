package java_Fundamentals;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
		int age = sc.nextInt();
		if(gender.equals("Male") && age >= 1 && age <= 58) {
			System.out.println("The percentage of intrest is 8.4%");
		}else if(gender.equals("Male") && age >= 59 && age <= 100) {
			System.out.println("The percentage of intrest is 10.5%");
		}else if(gender.equals("Female") && age >= 1 && age <= 58){
			System.out.println("The percentage of intrest is 8.2%");
		}else {
			System.out.println("The percentage of intrest is 9.2%");
		}
			
	}

}
