package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	
	// String str1="Keep";
	// String str2="Peek";	
		
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter first String :");
	String str1=sc.nextLine();
	System.out.println("Enter second String :");
	String str2=sc.nextLine();
	
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	
	//Check if length same
	if(str1.length()==str2.length()) {
		
		//Convert string to char Array
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		// sort the char array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		// if sorted char arrays are same
	    // then the string is anagram
		boolean result =Arrays.equals(ch1, ch2);
		
		if(result) {
			System.out.println(str1+" and "+str2+ " is "+" Anagram");
		}else {
			System.out.println( str1+" and "+str2+ " is "+"Not anagram");
		}
				
	}else {
		System.out.println(str1+" and "+str2+ " is "+"Not anagram");
	}
	
	}
}
