package string;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountEachElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str =sc.nextLine();
		str=str.toLowerCase();
		str=str.replaceAll("\\s","");
		int count=0;
		
		char[] ch= str.toCharArray();
		
		Map<Character,Integer> map = new TreeMap<>();
		
		for(int i =0 ;i<ch.length;i++) {
			  count=0;
			for(int j=0;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			map.put(ch[i], count);
		}
		System.out.println(map);
		
	}

}
