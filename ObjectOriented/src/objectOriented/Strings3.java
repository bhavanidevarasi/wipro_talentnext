package objectOriented;
import java.util.Scanner;
public class Strings3 {

	public static void main(String[] args) {
		
    Scanner str = new Scanner(System.in);
    
    System.out.println("Enter the String : ");
    String strr = str.next();
    System.out.println("Enter the value of n : ");
    int n = str.nextInt();
    String sub = strr.substring(0,2);
    for(int i = 0 ; i<=n; i++) {
    	System.out.print(sub);
    }
    
	}

}
