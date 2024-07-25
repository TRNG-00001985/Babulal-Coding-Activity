package FullStackJava;

import java.util.Scanner;

public class StringIsPalidrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		//String s="malayalam";
		String newstr="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			newstr=newstr+ch;
		}
			if(newstr.equals(s)) {
				System.out.println("String is palindrome");
		}
			else
				System.out.println("String is not palindrome");

	}

}
