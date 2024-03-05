package leetcode_strivers_dsa;

import java.util.ArrayList;
import java.util.List;

public class Rotate_Image_48 {
	public static void rotate(int[][] matrix) {
        int row=matrix.length;
        int col =matrix[0].length;
        int rcount=0;
        List <Integer> mylist  = new ArrayList<>();
  		  for(int i=0;i<row;i++){
	            for(int j=(col-1);j>=0;j--){
	            	mylist.add(matrix[j][i]);
	            }
        }     
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=mylist.get(rcount);
                rcount++;
            }
        }
    }
	
	public static void main(String[] args) {
		int  matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		  for(int i=0;i<3;i++){
	            for(int j=0;j<3;j++){
	                System.out.println(matrix[i][j]);
	            }
	        }
	}
}
