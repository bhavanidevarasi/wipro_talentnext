package java_fundamentals;
import java.util.Scanner;
public class ques_1 {
    public static void main(String[] args) {
     try(Scanner sc = new Scanner(System.in)){
    	 String company = sc.next();
    	 String location = sc.next();
    	 System.out.println(company + " Technologies " + location);
     }
    }
}

