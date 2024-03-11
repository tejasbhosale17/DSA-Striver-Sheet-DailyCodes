package leetcode_strivers_dsa;

public class Two_Sum_1 {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i=1;i<nums.length;i++)
            {
                for(int j=i;j<nums.length;j++)
                {
                    if(nums[j-i]+nums[j]==target)
                    {
                        result[0]=j-i;
                        result[1]=j;
                        return result;
                    }
                }
            }
        
        return result;
    }
    
    public static void main(String[] args) {
    	int nums[] = {2,7,11,15};
    	int target = 9;
    	int result[] = twoSum(nums, target);
    	System.out.println(result[0]+" "+result[1]);
	}
}
