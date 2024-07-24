package FullStackJava;

import java.util.Arrays;

public class CombineArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int length=arr1.length+arr2.length;
		int[] arr3=new int[length];
		System.arraycopy(arr1,0,arr3,0,arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arr3));

	}

}
