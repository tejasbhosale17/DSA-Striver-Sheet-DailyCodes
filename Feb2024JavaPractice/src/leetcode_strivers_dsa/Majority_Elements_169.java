package leetcode_strivers_dsa;

import java.util.Arrays;

public class Majority_Elements_169 {
	public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
	}
	
	public static void main(String[] args) {
		int nums[] = {3,2,3};
		int result= majorityElement(nums);
		System.out.println(result);
	}
}
