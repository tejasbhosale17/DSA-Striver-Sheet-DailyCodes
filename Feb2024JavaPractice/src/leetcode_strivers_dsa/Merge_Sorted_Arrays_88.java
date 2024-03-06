package leetcode_strivers_dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Sorted_Arrays_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        List <Integer> mArray  =new ArrayList<>();
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(nums1[i]>nums2[j]){
//                    mArray.add(nums2[j]);
//                }else {
//                	
//                	mArray.add(nums1[i]);
//                }
//            }
//        }
//        for(int i=0;i<mArray.size();i++) {
//        	System.out.println(mArray.get(i));
//        }
    	
    	for(int i=0,j=m;j<m+n;i++,j++) {
    		nums1[j]=nums2[i];
    	}
    	Arrays.sort(nums1);
    	
    	for(int i=0;i<nums1.length;i++) {
    		System.out.println(nums1[i]);
    	}
    	
    }
    
    public static void main(String[] args) {
		int nums1 [] = {1,2,3,0,0,0};
		int m = 3; 
		int nums2 [] = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}
}
