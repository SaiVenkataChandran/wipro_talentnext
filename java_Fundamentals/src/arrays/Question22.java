package arrays;

public class Question22 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 5, 6, 9, 47, 56};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i:nums) {
			min = Math.min(i, min);
			max = Math.max(i, max);
		}
		System.out.println("Maximum is: " + max);
		System.out.println("Minimum is: " + min);
	}

}