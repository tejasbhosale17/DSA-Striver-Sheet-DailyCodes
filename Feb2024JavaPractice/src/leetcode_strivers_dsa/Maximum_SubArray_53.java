package leetcode_strivers_dsa;

public class Maximum_SubArray_53 {
	 public static int maxSubArray(int[] nums) {
	        int csum=nums[0];
	        int msum=nums[0];

	        for(int i=1;i< nums.length;i++){
	            csum =Math.max(nums[i],(csum+nums[i]));
	            msum= Math.max(msum,csum);
	        }
	        return msum;
	    }
	 
	 public static void main(String[] args) {
		  int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int maxSum = maxSubArray(nums);
	        System.out.println("Maximum sum of a contiguous subarray: " + maxSum);
	}
}
