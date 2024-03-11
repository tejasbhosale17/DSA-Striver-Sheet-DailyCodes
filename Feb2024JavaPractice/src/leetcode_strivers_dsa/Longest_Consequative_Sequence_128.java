package leetcode_strivers_dsa;

import java.util.Arrays;

public class Longest_Consequative_Sequence_128 {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int count=1;
        if(nums.length==0 || nums==null){
            return 0;
        }
        System.out.println("length:"+nums.length);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }else if(nums[i]+1==nums[i+1]){
                count++;
                max=Math.max(count,max);
            }
            else{
                count=1;
            }
        }

        return max;
    }
    public static void main(String[] args) {
		int nums[] = {-8,-4,9,9,4,6,1,-4,-1,6,8};
		int maxi=longestConsecutive(nums);
		System.out.println(maxi);
		
	}
}
