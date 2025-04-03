package demo.ranjith.simple;

import java.util.ArrayList;
import java.util.List;

public class MatrixTravel {

	public static void main(String[] args) {
		int[][] matrix= {{1,3,8},
				          {5,7,2},
				          {9,3,5},
				          {0,1,6}};
          List<Integer> result= travelingArray(matrix);
          System.out.println(result);
	}

	private static List<Integer> travelingArray(int[][] matrix) {
		int row=matrix.length-1;
		int col=0;
		List<Integer> resultList= new ArrayList<>();
		resultList.add(matrix[row][col]);
		
		while(row>0 || col<matrix[0].length-1) {
			System.out.println("Current position: ("+row+","+col+") with value"+matrix[row][col]);
			if(row>0 && col<matrix[0].length-1) {
				if(matrix[row-1][col]>matrix[row][col+1]) {
					System.out.println("row number "+row);
					resultList.add(matrix[row-1][col]);
					row--;
					
				}
				else {
					System.out.print("col number "+col);
					resultList.add(matrix[row][col+1]);
					col++;
				}
			}
			else {
				if(row>0) {
					row--;
				}
				else {
					col++;
				}
			}
		}
		return resultList;
	}
}
