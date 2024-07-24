package FullStackJava;

import java.util.Arrays;

public class GetMaxandGetMin {

	public static void main(String[] args) {
		int[] arr= {5,8,4,2,9,5};
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);

	}

}
