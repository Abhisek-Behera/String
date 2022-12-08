package string;

import java.util.Scanner;

public class CountUpperLowerSpecialNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String str =sc.nextLine();
		
		int upper=0,lower=0,special=0,number=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			   lower++;
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			   upper++;
			else if(str.charAt(i)>='0' && str.charAt(i)<='9')
			   number++;
			else
				special++;
		}
		System.out.println("Lower :"+ lower);
		System.out.println("Upper :"+ upper);
		System.out.println("Number :"+number);
		System.out.println("Special :"+ special);

	}

}
