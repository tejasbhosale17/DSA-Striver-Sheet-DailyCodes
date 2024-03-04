package leetcode_strivers_dsa;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		triangle.add(firstRow);
		 for (int i = 1; i < numRows; i++) {
	            List<Integer> prevRow = triangle.get(i - 1);
	            List<Integer> row = new ArrayList<>();
	
	            row.add(1);
	
	            for (int j = 1; j < i; j++) {
	                row.add(prevRow.get(j - 1) + prevRow.get(j));
	            }
	            row.add(1);
	            triangle.add(row);
	        }
	        return triangle;
    }
	
	public static void main(String[] args) {
		int x=5;
		generate(x);
	}
}
