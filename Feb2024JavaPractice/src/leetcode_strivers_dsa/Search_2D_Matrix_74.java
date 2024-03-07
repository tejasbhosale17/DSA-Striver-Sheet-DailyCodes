package leetcode_strivers_dsa;

public class Search_2D_Matrix_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n =matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		boolean isit= searchMatrix(matrix,target);
		System.out.println(isit);
	}
}
