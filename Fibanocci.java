package FullStackJava;

public class Fibanocci {

	public static void main(String[] args) {
		int n=5;
		int a=0;
		int b=1;
		int fib=0;
		while(n>0) {
			fib=a+b;
			a=b;
			b=fib;
			System.out.print(fib+" ");
			n--;
		}

	}

}
