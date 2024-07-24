package FullStackJava;

import java.util.Arrays;

public class ContainsDuplicates {
	public static boolean ContainDuplicats(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,5,4,1,2,5};
		boolean dup=ContainDuplicats(arr);
		System.out.println(dup);

	}

}
