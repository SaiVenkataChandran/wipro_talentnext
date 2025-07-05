package arrays;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		int[] nums  = {1, 4, 34, 56, 7};
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		sc.close();
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == value) {
				System.out.println("Index: " + i);
				return;
			}
		}
		System.out.println(-1);

	}
}
