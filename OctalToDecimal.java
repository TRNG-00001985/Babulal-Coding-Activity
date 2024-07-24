package FullStackJava;

public class OctalToDecimal {
	public static String octalToDecimal(int octal) {
		StringBuilder hexstring=new StringBuilder(); 
		int decimal=0;
		int i=0;
		while(octal!=0) {
			int rem=octal%10;
			decimal=(int) (decimal+rem*Math.pow(8, i));
			octal=octal/10;
			i++;
		}
		while(decimal>0) {
			int rem=decimal%16;
			if(rem>10) {
				hexstring.insert(0, rem);
			}
			else {
				hexstring.insert(0, (char)('A'+(rem-10)));
		}
			decimal=decimal/16;
	}
		return hexstring.toString();
}

	public static void main(String[] args) {
		int octal=45;
		String result=octalToDecimal(octal);
		System.out.println("The decimal number of "+octal+" is "+result);

	}

}
