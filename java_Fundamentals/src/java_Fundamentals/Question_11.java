package java_Fundamentals;

import java.util.Scanner;
public class Question_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'R':System.out.println("Red");
			break;
			case 'G':System.out.println("Green");
			break;
			case 'B':System.out.println("Blue");
			break;
			case 'O':System.out.println("Orange");
			break;
			case 'Y':System.out.println("Yellow");
			break;
			case 'W':System.out.println("White");
			break;
			default:System.out.println("Enter valid character");
		}
		

	}

}
