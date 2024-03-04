package leetcode_strivers_dsa;

public class Sort_Colors_75 {

	public static void sortColors(int[] nums) {
	       int zeros=0,ones=0,twos=0;
	       for(int i=0;i<nums.length;i++){
	           if(nums[i]==0){
	               zeros++;
	           }else if(nums[i]==1){
	               ones++;
	           }else if(nums[i]==2){
	               twos++;
	           }
	       }
	       int arr[] = new int[nums.length];

	       for(int i=0;i<zeros;i++){
	           arr[i]=0;
	       }
	       for(int i=zeros;i<(zeros+ones);i++){
	           arr[i]=1;
	       }
	       for(int i=(zeros+ones);i<(zeros+ones+twos);i++){
	           arr[i]=2;
	       }
	        for(int i=0;i<arr.length;i++){
	            nums[i]=arr[i];
	        }
	       
	    }
	public static void main(String[] args) {
		int nums[] = {2,0,2,1,1,0};
		sortColors(nums);
		
		for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);         }
		
	}
	
}
