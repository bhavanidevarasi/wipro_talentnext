package java_fundamentals;
import java.util.*;
public class Arrays_Quest_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23, 45, 23, 66, 45, 90, 82, 66};

        
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

      
        for (int num : set) {
            System.out.print(num + " ");
        }

	}

}
