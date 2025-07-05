package arrays;

public class Question26 {
	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Please enter 4 integer number");
			return;
		}
		int[][] nums = new int[2][2];
		int index = 0;
		System.out.println("The given array is: ");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[i][j] = Integer.parseInt(args[index++]);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		int index1 = args.length-1;
		System.out.println("The reverse array is: ");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[i][j] = Integer.parseInt(args[index1--]);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}


	}

}

//ctrl+space; 
//ctrl+1;
//sysout;
//windows+.; emojis
//ctrl+shift+f; formats code
//select text ctrl+1 and extract to other code snippet;