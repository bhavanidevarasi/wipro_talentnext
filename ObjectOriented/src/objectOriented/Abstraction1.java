package objectOriented;
//package abstraction;
import java.util.Random;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
		return "This is the first class";
	}
}
class Ladies extends Compartment{
	public String notice() {
		return "This is the ladies class";
	}
}
class General extends Compartment{
	public String notice() {
		return "This is the general class";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "This is the luggage class";
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment [] compartment = new Compartment[10];
		Random ran = new Random();
		for (int i = 0; i < compartment.length; i++) {
            int type = ran.nextInt(4) + 1;  // 1 to 4

            switch (type) {
                case 1:
                    compartment[i] = new FirstClass();
                    break;
                case 2:
                    compartment[i] = new Ladies();
                    break;
                case 3:
                    compartment[i] = new General();
                    break;
                case 4:
                    compartment[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Compartment Notices:");
        for (int i = 0; i < compartment.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartment[i].notice());
        }
        
	}

}