package leetcode_strivers_dsa;

public class Set_Matrix_Zeros_73 {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int x [] = new int[m+n];
        int y [] = new int[m+n];
        boolean ifExists = false;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    x[count]=i;
                    y[count]=j;
                    ifExists =true;
                    count++;
                }          
            }
        } 
    if(ifExists){
        for(int q=0;q<count;q++){
            for(int l=0;l<n;l++){
            matrix[x[q]][l]=0;
            }


            for(int k=0;k<m;k++){
                matrix[k][y[q]]=0;
            }
               
        }  
    }   
    }

	
public static void main(String[] args) {
	
}
}
