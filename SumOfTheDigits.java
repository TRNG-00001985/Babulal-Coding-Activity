package FullStackJava;

public class SumOfTheDigits {

	public static void main(String[] args) {
		int n=325;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);

	}

}
