package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String :");
		String str =sc.nextLine();
		String rstr ="";
		char ch;
		
		System.out.println("Original string: "+ str);
		for (int i=0; i<str.length(); i++) {
			ch=str.charAt(i); // extracts each character
			rstr =ch+rstr;   //  adds each character in front of the existing string
		}
         
		System.out.println("Reverse String : "+rstr);
		
		//Pallindrom
		if(str.equals(rstr)) {
			System.out.println(str+" is Pallindrom");
		}else {
			System.out.println(str+" is Not Pallindrom");
		}
	   
	}

}
