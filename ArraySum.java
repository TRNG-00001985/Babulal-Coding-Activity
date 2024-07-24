package FullStackJava;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
		}
		System.out.println("Array sum is "+sum);
		int avg=(int) ((double)sum/arr.length);
		System.out.println("Average of the array is "+avg);

	}

}
