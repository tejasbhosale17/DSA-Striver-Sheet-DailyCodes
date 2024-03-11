package leetcode_strivers_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Majority_Elements_2_229 {
    public static List<Integer> majorityElement(int[] nums) {
    	List<Integer> result = new ArrayList<>();
    	HashMap<Integer, Integer> mmap = new HashMap<>();
        
        for (int num : nums) {
            if (mmap.containsKey(num)) {
                // If the number is already present in the map, increment its count
                mmap.put(num, mmap.get(num) + 1);
            } else {
                // If the number is not present in the map, add it with count 1
                mmap.put(num, 1);
            }
        }
        for (Integer key : mmap.keySet()) {
        	if(mmap.get(key) >(nums.length/3)) {
        		result.add(key);
        	}
        }
        
    	
        for (Integer key : mmap.keySet()) {
            System.out.println("Element: " + key + ", Occurrences: " + mmap.get(key));
        }
    	
    	
    	return result;
    	

    	
//    	int n=nums.length;
//        List<Integer> result = new ArrayList<>();
//        int temp [][] = new int[nums.length][2];
//        Arrays.sort(nums);
//        int count=0;
//        int abc=0;
//        for(int i=0;i<nums.length-1;i++) {
//        	if(nums[i]==nums[i+1]) {
//        		
//        		count++;
//        		System.out.println(count);
//        		temp[abc][0]=nums[i];
//        		temp[abc][1]=count;
//        		System.out.println(nums[i]+" in if "+count);
//        		abc++;
//        	}
//        }
//        
//        Arrays.toString(temp);
//        
//        for(int i=0;i<temp.length;i++) {
//        	if(temp[i][1]>(n/3)) {
//        		result.add(temp[i][0]);
//        	}
//        }
//        
//        for(int i=0;i<result.size();i++) {
//        	System.out.println("result is"+result.get(i));
//        }
        
//        return result;
    }
    
    public static void main(String[] args) {
		int nums[] = {3,2,3,4,2,1,3,2,2,3};
		List<Integer> result = new ArrayList<>();
		result =majorityElement(nums);
		System.out.println(result);
	}
}
