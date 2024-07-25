package FullStackJava;

import java.util.Arrays;

public class SubArray {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] subarray=Arrays.copyOfRange(arr, 2, 6);
		System.out.println("original Array "+Arrays.toString(arr));
		System.out.println("Subarray "+Arrays.toString(subarray));
		
	}
}