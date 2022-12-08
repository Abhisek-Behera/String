package string;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		
        String str="KING";
		
		if(str.equals(str.toUpperCase())) { 
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");}
		
		if(str.equals(str.toLowerCase())) { 
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");}
	}

}
