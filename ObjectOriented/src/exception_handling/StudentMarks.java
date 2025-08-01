package exception_handling;
import java.util.Scanner;
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}


class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}
class Student{
	String student;
    int sub1, sub2, sub3;

    public Student(String name, int sub1, int sub2, int sub3)
            throws NegativeValueException, OutOfRangeException {
        this.student = name;
        this.sub1 = validateMarks(sub1);
        this.sub2 = validateMarks(sub2);
        this.sub3 = validateMarks(sub3);
    }
    private int validateMarks(int marks) throws NegativeValueException, OutOfRangeException {
        if (marks < 0) {
            throw new NegativeValueException("Marks cannot be negative: " + marks);
        }
        if (marks > 100) {
            throw new OutOfRangeException("Marks should be in the range 0 to 100: " + marks);
        }
        return marks;
    }
	public void studentResult() {
		System.out.println("Name of the Stu1 is : " + student);
		System.out.println("Marks : " + sub1 + " , " + sub2 + " , " + sub3 );
			int sum = sub1 + sub2 + sub3;
			System.out.println("Average : " + (sum/3));
		
	}
	
}
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stu = new Scanner(System.in);
		//Student stud = new Student(name,s1,s2,s3);
		//Student stud1 = new Student();
		try {
			
		
		System.out.println("Enter the student one name : ");
		String name = stu.next();
		//stud.student=name;
	     System.out.println("Enter the student one marks : ");
		int s1 = stu.nextInt();
		int s2 = stu.nextInt();
		int s3=stu.nextInt();
		Student stud = new Student(name,s1,s2,s3);

		
	//	Student stud1 = new Student(name1, su1,su2,su3);
		
		System.out.println("Enter the student two name : ");
		String name1 = stu.next();
		//stud1.student=name1;
		System.out.println("Enter the student two marks : ");
		int su1 = stu.nextInt();
		int su2 = stu.nextInt();
		int su3=stu.nextInt();
		Student stud1 = new Student(name1, su1,su2,su3);
		stud1.studentResult();
		stud.studentResult();
		} catch (NegativeValueException | OutOfRangeException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Unknown error: " + e.getMessage());
        } finally {
            stu.close();
        }

	}

}
