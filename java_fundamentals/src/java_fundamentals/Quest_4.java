package java_fundamentals;
import java.util.Scanner;

public class Quest_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try(Scanner sc = new Scanner(System.in)){
    	   int n = sc.nextInt();
    	   if(n >=1 ) {
    		   System.out.println(n + " is positive number ");
    	   }
    	    else if(n == 0) {
    	    	System.out.println(n + " is Zero ");
    	    }
    	    else {
    	    	System.out.println(n + " is negative number ");
    	    }
       }
	}

}
