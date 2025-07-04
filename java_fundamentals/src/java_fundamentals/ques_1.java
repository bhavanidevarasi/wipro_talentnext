package java_fundamentals;

public class ques_1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide exactly two arguments: <Company> <Location>");
            return;
        }

        String company = args[0];
        String location = args[1];

        System.out.println(company + " Technologies " + location);
    }
}

