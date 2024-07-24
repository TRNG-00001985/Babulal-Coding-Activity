package FullStackJava;

public class ReverseAString {

	public static void main(String[] args) {
		String str="Babulal";
		String newstr="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			newstr=newstr+ch;
		}
		System.out.println(newstr);


	}

}
