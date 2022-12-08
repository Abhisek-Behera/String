package string;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
        String st=sc.nextLine();
        st=st.replaceAll("\\s","");
		
		char[] ch = st.toCharArray();
		
		//One Way
		//Arrays.sort(ch);
		//System.out.println(ch);
		
		
		//Second Way
		char temp;
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {   //If we put j=0 we get in decending order
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
       System.out.println(new String(ch));
	}

}
