package FullStackJava;

import java.util.Scanner;

public class GreaterOrLesserfor3numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a>b ? a>c? "a is big":"b is big":b>c?"b is big":"c is big");
	}

}
