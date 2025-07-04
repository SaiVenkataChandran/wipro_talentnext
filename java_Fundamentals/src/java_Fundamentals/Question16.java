package java_Fundamentals;

public class Question16 {

	public static void main(String[] args) {
		for(int i=10;i<100;i++) {
			isPrime(i);
		}

	}
	
	static void isPrime(int num) {
		if(num % 2 == 0) return;
		for(int i=3;i<=Math.sqrt(num);i += 2) {
			if(num % i == 0) return;
		}
		System.out.print(num + " ");
	}

}
