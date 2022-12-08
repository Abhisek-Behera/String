package string;

public class RemoveDuplicateInString {
    
	public static String removeDuplicate(String str) {
		
		String newStr ="";
		char ch;
		
		for (int i =0;i<str.length();i++) {
			
			 ch = str.charAt(i); //extract each character
			
			if(newStr.indexOf(ch)== -1)  { //indexOf takes one character as parameter and checks whether it is present or not in newStr
			                               // if character is not available it returns -1 and its will add ch to newStr	
				newStr = newStr+ch;
			}  
			
		}	
		return newStr ;
	}
	
	public static void main(String[] args) {
		
		String str ="Guddu is best";
		str=str.replaceAll("\\s","");
		System.out.println("Original string : "+str);
        System.out.println("Remove Duplicates :"+removeDuplicate(str));
	}

}
