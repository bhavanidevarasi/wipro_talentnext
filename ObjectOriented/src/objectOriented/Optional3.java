package objectOriented;
import java.util.Optional;
public class Optional3 {
     String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Optional3 Employee = new Optional3();
        Optional<String> na = Optional.ofNullable(Employee.name);
        System.out.println(na.get());
	}

}
