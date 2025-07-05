package arrays;

public class Question21 {

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i:nums) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + sum/nums.length);

	}

}