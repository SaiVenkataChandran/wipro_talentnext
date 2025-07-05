package arrays;

public class Question25 {

	public static void main(String[] args) {
		if(args.length != 9) {
			System.out.println("Please enter 9 integer number");
			return;
		}
		int[][] nums = new int[3][3];
		int index = 0;
		int max = Integer.MIN_VALUE;
		System.out.println("The given array is: ");
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				nums[i][j] = Integer.parseInt(args[index++]);
				System.out.print(nums[i][j] + " ");
				if(nums[i][j] > max) max = nums[i][j];
			}
			System.out.println();
		}		
		System.out.println("The biggest number in the given array is " + max);

	}

}
