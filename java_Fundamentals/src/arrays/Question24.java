package arrays;

public class Question24 {

	public static void main(String[] args) {
		int[] nums = {9,8,7,6,5,4,3,2,1};
		for(int i =0 ;i< nums.length-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		for(int i:nums) {
			System.out.print(i + " ");
		}

	}

}