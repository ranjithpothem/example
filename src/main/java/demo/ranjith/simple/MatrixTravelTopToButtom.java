package demo.ranjith.simple;

import java.util.ArrayList;
import java.util.List;

public class MatrixTravelTopToButtom {

	public static void main(String[] args) {
		int[][] matrix= {{1,3,8},
		          {5,7,2},
		          {9,3,5},
		          {0,1,6}};;
		
		System.out.print(matrix.length);
	 List<Integer> resultList=	travelArray(matrix);
	 System.out.println(resultList);

	}
	private static List<Integer> travelArray(int[][] matrix) {
	int	row=0;
	int col=0;
	List<Integer> resultList=new ArrayList<>();
	resultList.add(matrix[row][col]);
	while(row<matrix.length || col<matrix[0].length-1) {
		System.out.println("current position "+row+","+col+" value"+matrix[row][col]);
		if(row<matrix.length && col<matrix[0].length-1) {
		if(matrix[row+1][col]>matrix[row][col+1]) {
			resultList.add(matrix[row+1][col]);
			row++;
		}
		else {
			resultList.add(matrix[row][col+1]);
			col++;
		}
	}
		else{
			if(row<matrix.length) {
				row++;
			}
			else{
				col++;
			}
		}
	}
	return resultList;
	}

}
