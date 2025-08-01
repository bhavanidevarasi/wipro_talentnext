package exception_handling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if(args.length !=2) {
				throw new IllegalArgumentException("Enter exactly two Arguments");
			}
			String name = args[0];
			int age;
			try {
				age=Integer.parseInt(args[1]);
			}catch(Exception e) {
				throw new InvalidAgeException("Age must be a number");
			}
			if(age <= 18 || age >=60 ) {
				throw new InvalidAgeException("Enter the valid age");
			}
			System.out.println("Name : " + name);
			System.out.println("Age : " + age);
			System.out.println("The details are correct");
			
		}catch(Exception e) {
			System.out.println("InvalidAgeException");
		}

	}

}
