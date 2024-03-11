package leetcode_strivers_dsa;

import java.util.ArrayList;
import java.util.List;

public class Merge_Intervals_56 {
	public static void merge(int[][] intervals) {
		
		int looped=0;
		while(looped!=intervals.length-1) {
			int yes=0;
			for(int i=0;i<(intervals.length-1);i++) {
				if((intervals[i+1][0]-intervals[i][1])<=0) {
					yes++;
				}
			}
//			System.out.println("no of overlaps:"+yes);
			
			int count=0;
			int merged [][] = new int[intervals.length-(yes)][2];
			for(int i=0;i<(intervals.length-1);i++) {
				if((intervals[i+1][0]-intervals[i][1])<=0) {
					int newArr[] = new int[2];
					newArr[0]=intervals[i][0];
					newArr[1]=intervals[i+1][1];
//					System.out.println("intervals at Overlaped:"+i);
//					System.out.println(newArr[0]+" "+newArr[1]);
					merged[count][0]=newArr[0];
					merged[count][1]=newArr[1];
					System.out.println("i value: "+i+", interval value:"+intervals[i+1][0]+" "+intervals[i+1][1]+" count :"+count);
					count++;
					i++;
				}
//				else if(i==(intervals.length-2)){
//					merged[count][0]=intervals[i+1][0];
//					merged[count][1]=intervals[i+1][1];
//					count++;
//					System.out.println(intervals[i+1][0]+" "+intervals[i+1][1]);
//					merged[count][0]=intervals[i+1][0];
//					merged[count][1]=intervals[i+1][1];
//					count++;
//				}
				else {
					merged[count][0]=intervals[i][0];
					merged[count][1]=intervals[i][1];
					count++;
				}
				
			}
			for(int i=0;i<merged.length;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(merged[i][j]);	
				}
				System.out.print(" ");
			}
			System.out.println("");
			System.out.println("=========="+looped+" Loop Completed!============");
			looped++;
		}
		
//			merged[count][0]=intervals[intervals.length-1][0];
//			merged[count][1]=intervals[intervals.length-1][1];
//			count++;
//		
//		for(int i=0;i<merged.length;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(merged[i][j]);	
//			}
//			System.out.print(" ");
//		}
//		return merged;	
	}

//==============================================================================
//    int count=0;
//	int merged [][] = new int[intervals.length][2];
//	for(int i=0;i<(intervals.length-1);i++) {
//		if((intervals[i+1][0]-intervals[i][1])<=0) {
//			int newArr[] = new int[2];
//			newArr[0]=intervals[i][0];
//			newArr[1]=intervals[i+1][1];
//			System.out.println(newArr[0]+" "+newArr[1]);
//			merged[count][0]=newArr[0];
//			merged[count][1]=newArr[1];
//			count++;
//		}else {
//			merged[count][0]=intervals[i][0];
//			merged[count][1]=intervals[i][1];
//		}
//	}
//    return merged;
//=========================================================================	
	
	
	public static void main(String[] args) {
		int intervals [][] = {{1,3},{2,6},{8,10},{14,17},{15,18},{22,25}};
		merge(intervals);
		
//		Output: [[1,6],[8,10],[15,18]]
	}
}
