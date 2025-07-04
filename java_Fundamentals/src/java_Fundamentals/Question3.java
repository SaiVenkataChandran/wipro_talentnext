package java_Fundamentals;

public class Question3 {

	public static void main(String[] args) {
		if(args.length != 2) return;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("The sum of "+ num1 +" and " + num2 +" is: "+ (num1+num2));
	}

}
