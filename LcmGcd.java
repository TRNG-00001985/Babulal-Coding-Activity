package FullStackJava;

import java.util.Scanner;

public class LcmGcd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=0;
		for(int i=1;i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("gcd of "+a+" and "+b+" is "+gcd);
		int lcm=(a*b)/gcd;
		System.out.println("lcm of "+a+" and "+b+" is "+lcm);
	}

}
