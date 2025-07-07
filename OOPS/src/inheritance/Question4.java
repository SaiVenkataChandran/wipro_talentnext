package inheritance;

public class Question4 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.fly();
		bird.eat();
		bird.sleep();

	}

}

class Animal{
	void eat() {
		System.out.println("Parent class: Eat Method");
	}
	
	void sleep() {
		System.out.println("Parent class: Sleep Method");
	}
}

class Bird extends Animal{
	void eat() {
		System.out.println("Child class: Eat Method");
	}
	
	
	void sleep() {
		System.out.println("Child class: Sleep Method");
	}
	
	void fly() {
		System.out.println("Child class: Fly Method");
		
	}
}