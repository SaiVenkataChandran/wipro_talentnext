package classes_Objects;

public class Question1 {

	public static void main(String[] args) {
		
		Box box = new Box(4.53, 5.98, 6.54);
		double res = box.getVolume();
		System.out.println("The volume of the box is: " + res + " cubic units");
		

	}

}

class Box{
	double width;
	double height;
	double depth;
	public Box(double width,double height,double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getVolume() {
		return width*height*depth;
	}
}
