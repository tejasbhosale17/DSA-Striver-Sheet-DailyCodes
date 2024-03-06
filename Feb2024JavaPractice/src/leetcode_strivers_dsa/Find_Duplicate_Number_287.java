package leetcode_strivers_dsa;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Duplicate_Number_287 {
    public static int findDuplicate(int[] nums) {
//====================== Using Array Manipulation ============================
    	//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//        	System.out.println(nums[i]);
//        }
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==nums[i+1]){
//            	
//            return nums[i];
//            }
//        }
//        return 0;
    	
//======================== Using hashMap ==================================  	
    	//int nums[] = {3,1,3,4,2};
//    	HashMap<Integer, Integer> ht1= new HashMap<Integer, Integer>();
//    	for(int i=0;i<nums.length;i++){
//    		for(int j=0;j<nums.length-1;j++) {
//    		int count=1;
//	         if(nums[i]==nums[j] && i!=j){
//	          	count++;
//	          	ht1.put(nums[i], count);
//	          	System.out.println("In If:"+nums[i]+" "+count);
//	          	return nums[i];
//	         }else {
//	        	  ht1.put(nums[i],count);
//	        	  System.out.println("else:"+nums[i]+" "+count);
//	         }
//    		}
//    	}
//    	
//    	for (Integer key : ht1.keySet()) {
//    		if(ht1.get(key)==2) {
//    			System.out.println("State : " + key + "\tName : " + ht1.get(key));
//    			return key;
//    		}
//        }
//    	return 0;
//    	
    	
//================ Easiest Solution but Time Limit Excedded ======================
    	for(int i=0;i<nums.length;i++){
    		for(int j=i+1;j<nums.length;j++) {
    		int count=1;
	         if(nums[i]==nums[j]){
	          	return nums[i];
	         }
    		}
    	}
    	return 0;
//================================================================================   	
 	
    }
    
    public static void main(String[] args) {
		int nums[] = {1,3,4,2,2};
		int result =findDuplicate(nums);

		System.out.println(result);
	}
	
	
}
