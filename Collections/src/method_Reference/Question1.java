package method_Reference;

public class Question1 {

	public static void main(String[] args) {
		Fact fact = new Fact();
		int n = 6;
		System.out.println("Factorial of " + n  + " is " + fact.factorialFun(n));

	}

}

@FunctionalInterface
interface Factorial {
	int factorial(int n);
}

class Fact {
	int factorialFun(int n) {
		if (n == 1 || n == 0)
			return n;
		int fact = n * factorialFun(n - 1);
		return fact;
	}

}
