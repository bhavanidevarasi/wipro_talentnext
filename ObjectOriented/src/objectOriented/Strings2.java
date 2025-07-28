package objectOriented;
import java.util.Scanner;
public class Strings2 {
public static void main(String[] args) {
	Scanner str = new Scanner(System.in);
	System.out.println("Enter the String 1 : ");
	String s1 = str.next().toLowerCase();
	
	System.out.println("Enter the String 2 : ");
	String s2 = str.next().toLowerCase();
	
	if(s1.charAt(s1.length()-1) == s2.charAt(0)) {
		s2 = s2.substring(1);	
	}
	String reult = s1.concat(s2);
	System.out.println(reult);
}
}
