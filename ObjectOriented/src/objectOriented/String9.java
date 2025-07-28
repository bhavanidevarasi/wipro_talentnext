package objectOriented;
import java.util.Scanner;
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String a = sc.next();
        System.out.println("Enter the String 2 : ");
        String b = sc.next();
        StringBuilder result = new StringBuilder();
        int i = 0;
        int minLength = Math.min(a.length(), b.length());

     
        while (i < minLength) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
            i++;
        }

        
        if (a.length() > b.length()) {
            result.append(a.substring(i));
        } else if (b.length() > a.length()) {
            result.append(b.substring(i));
        }

        System.out.println("Output: " + result.toString());
	}

}
