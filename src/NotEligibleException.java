import java.util.Scanner;

public class NotEligibleException extends RuntimeException{
    public NotEligibleException(String msg)
    {
        System.out.println(msg);
    }
}
class Student{
    public static void main(String[] args) {
        System.out.println("Enter Degree % :");
        Scanner sc = new Scanner(System.in);
        double perCen=sc.nextDouble();
        if(perCen<60)
        {
            throw new NotEligibleException("Not eligible for the drive");

        }
        else {
            System.out.println("Register before day ending");
        }
    }
}
