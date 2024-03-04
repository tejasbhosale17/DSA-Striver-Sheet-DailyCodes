package leetcode_strivers_dsa;

public class Set_Matrix_Zeros_73 {
 public void setZeroes(int[][] matrix) {
	int m=matrix.length;
	int n=matrix[0].length;
	int x = 1000;
	int y = 1000;
	boolean ifExists = false;
	int count =0;
	for(int i=0;i<m;i++){
	    for(int j=0;j<n;j++){
	        if(matrix[i][j]==0){
	            count ++;
	        }          
	    }
	} 

while(count!=0) {
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        if(matrix[i][j]==0){
		            x=i;
		            y=j;
		            ifExists =true;
		            break;
		        }          
		    }
		} 
		if(ifExists){
			for(int k=0;k<m;k++){
			   if(k == x || k == y){
			      for(int l=0;l<n;l++){
			    	  matrix[k][l]=0;
			       }
			    }
			}
			for(int l=0;l<n;l++){
			    if(l == y || l == x){
			        for(int k=0;k<m;k++){
			            matrix[k][l]=0;
			        }
			    }
			}
		}
		count--;
	}        
}


	
public static void main(String[] args) {
	
}
}
