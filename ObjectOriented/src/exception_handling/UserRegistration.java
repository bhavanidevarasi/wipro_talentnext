package exception_handling;
import java.util.Scanner;
class InvalidCountryException extends Exception{
	public InvalidCountryException(String message) {
		super(message);
	}
}
public class UserRegistration {
	public void registerUser(String userName, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully!!");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
      // String name = sc.next();
       //String country = sc.next();
       System.out.print("Enter your name: ");
       String name = sc.next();

       System.out.print("Enter your country: ");
       String country = sc.next();

       UserRegistration ur = new UserRegistration();
       try {
           ur.registerUser(name, country);
       } catch (InvalidCountryException e) {
           System.out.println(e.getMessage());
       } finally {
           sc.close();
       }

}}
