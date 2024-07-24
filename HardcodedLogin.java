package FullStackJava;

import java.util.Scanner;

public class HardcodedLogin {

	public static void main(String[] args) {
		String username="babulalsk";
		String password="password123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a username");
		String inputUsername=sc.nextLine();
		System.out.println("Enter a Password");
		String inputPassword=sc.nextLine();
		if(inputUsername.equals(username) && inputPassword.equals(inputPassword)) {
			System.out.println("Login successfull..!!!!");
		}
		else
			System.out.println("Username or password is incorrect");
	}

}
