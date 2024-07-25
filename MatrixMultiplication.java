package FullStackJava;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] matrix1= {{1,2,3},
				          {4,5,6}};
		int[][] matrix2= {{1,2},
				          {4,5},
		                  {6,7}};
		int rows=matrix1.length;
		int columns=matrix1[0].length;
		int columns2=matrix2[0].length;
		int[][] mul=new int[rows][columns2];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				int sum=0;
				for(int k=0;k<columns2;k++) {
					sum=sum+matrix1[i][k]*matrix2[k][j];
				}
				mul[i][j]=sum;
			}
			}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns2;j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}

	}

}
