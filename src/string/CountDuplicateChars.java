package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountDuplicateChars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		str=str.toLowerCase();
		
		Map<Character,Integer> map=new HashMap<>();
		
		//Convert string into new Character Array
		char[] ch = str.toCharArray();

		//Iterating each character to check that character is present in the map or Not
		for(char c :ch) {
			if(map.containsKey(c)) { //containsKey is used to check key is present in map or Not
		        //Get value by key and increment its value by 1
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			if(e.getValue()>1) {  //Here we check the count is greater than 1 then it will print
				System.out.println("Key : "+e.getKey()+" Value : "+e.getValue());
			}
			
		}
	}

}
