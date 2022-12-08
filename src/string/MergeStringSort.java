package string;

import java.util.Arrays;

public class MergeStringSort {
       
	public static void main(String[] args) {
	
		
		String str ="guddu";
		String str1="raja";
		String str3=str+str1;
		
		char[] ch =str3.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(ch);

	}
}
