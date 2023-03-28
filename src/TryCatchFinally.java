public class TryCatchFinally {

    public static void div() {
        try {
            int a = 10, b = 0, c;
            c = a / b;
        }
        catch (ArithmeticException e)
        {
            System.out.println(("Exception is ocurred and handled for line 6"));
        }
        try {
            int arr[] = new int[3];
            arr[4] = 55;
        }
        catch (Exception f)
        {
            System.out.println("Exception is ocurred and handled for line 14");
        }
        finally {
            System.out.println("Finally Block"); // occur or not it will executes
        }

    }

    public static void main(String[] args) {
        div();
        System.out.println("End of main");
    }
}
