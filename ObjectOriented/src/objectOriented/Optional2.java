package objectOriented;
import java.util.Optional;
public class Optional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = null;
        Optional<String> na = Optional.ofNullable(name);
        System.out.println(na.orElse("India"));
	}

}
