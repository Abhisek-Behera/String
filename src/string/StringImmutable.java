package string;

public class StringImmutable {
     
	public static void main(String args[]) {
	String str = "Parthabi";
	String str1 = "Parthabi";
	str=str.concat("  Dhoni");
    
	String str3 = "Parthabi"+1+2+3+"AMIT";  // Output Questions
	
	System.out.println(str3);
	System.out.println(str1);
	
	}
	
}
