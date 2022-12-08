package string;

public class PalindromString {

	public static void main(String[] args) {
		
		
		String str="Radar";
		str= str.toLowerCase();
		String rstr="";
		
		int length =str.length();
		
		//To check if a string is a palindrome or not, a string needs to be compared with the reverse of itself.
		for(int i =length-1;i>=0;i--)
			rstr = rstr+ str.charAt(i);
		
		if(str.equals(rstr))
			System.out.println(str+" Is PALINDROM");
		else
			System.out.println(str+" Is NOT PALINDROM");
			

	}

}
