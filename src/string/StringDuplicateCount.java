package string;

public class StringDuplicateCount {

	public static void main(String[] args) {
		
		  String str = "Guddu";
		  int count = 0;
		  char[] ch = str.toCharArray();
		  
		  for (int i = 0; i < ch.length; i++) {  //It will count each character
		   for (int j = i+1; j < ch.length; j++) { //It will start from i+1 and count
		    if (ch[i] == ch[j]) {    //If index of i equals with index of j
		     System.out.println("Duplicate Characters are: "+ch[j]);
		     count++;
		     break;
		    }
		  }	   
	    }
		  System.out.println("Count :"+count);
	}
}
