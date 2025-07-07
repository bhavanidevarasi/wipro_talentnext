package java_fundamentals;
import java.util.*;


public class Arrays_Quest_8 {
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 5, 6, 8, 9, 7, 2};
        
        int start = 6;
        int end = 7;
        boolean skipping = false;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == start) {
                skipping = true;
                continue;
            }
            if (arr[i] == end && skipping) {
                skipping = false;
                continue;
            }
            if (!skipping) {
                sum += arr[i];
            }
        }

        System.out.println("Sum (excluding values between " + start + " and " + end + "): " + sum);
    }
}

