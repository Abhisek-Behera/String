package string;

import java.util.Scanner;

public class VowelAndConsonantCount {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		int vCount=0 , cCount=0;
		
		for(int i=0;i<str.length();i++) {
			// check if char[i] is vowel
			if(str.charAt(i)=='a'||         // || logical or operator
					str.charAt(i)=='e'||
					str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
				// count increments if there is vowel in
                // char[i]
				
				vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				cCount++;
			}
			
		}
	System.out.println("Vowles "+vCount);
	System.out.println("Consonant "+cCount);

	}

}
