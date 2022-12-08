package string;

public class Panagram {

	public static void main(String[] args) {
		
		// String s ="The quick brown fox jumps over the lazy dog";
		String s ="guddu";
		s=s.toLowerCase();
		s=s.replaceAll("\\s","");
		System.out.println(isPanagram(s));

	}

	private static boolean isPanagram(String s) {
		if(s.length()<26) {     // //length of the string is 26 or not
			return false;
		}else {
			for(char ch='a';ch<='z';ch++) {    // It will iterate all the characters one by one
				if(s.indexOf(ch)<0) {          // It starts from 'a' where it takes the index if it no less than zero it will not enter if loop
					return false;
				}
			}
			
		}

		return true;
	}

}
