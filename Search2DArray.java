package FullStackJava;

import java.util.Arrays;

public class Search2DArray {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},
				         {4,5,6},
				         {7,8,9}};
		int search=5;
		int[] ans=linearSearch(matrix,search);
		System.out.println("Element found at index "+Arrays.toString(ans));
	}
		static int[] linearSearch(int[][] matrix, int search) {
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[i].length;j++) {
					if(matrix[i][j]==search) {
						return new int[] {i,j};
					}
				}
			}
			return new int[] {-1,-1};
	}

}
