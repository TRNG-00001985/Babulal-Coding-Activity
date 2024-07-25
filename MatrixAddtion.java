package FullStackJava;

public class MatrixAddtion {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},
				         {4,5,6},
				         {7,8,9}};
		int[][] matrix2= {{1,2,3},
				          {4,5,6},
				          {7,8,9}};
		int rows=matrix.length;
		int columns=matrix[0].length;
		int[][] sum=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				sum[i][j]=matrix[i][j]+matrix2[i][j];
			}
		}
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					System.out.print(sum[i][j]+" ");
				}
				System.out.println();

		}
			
		}
	
	}

