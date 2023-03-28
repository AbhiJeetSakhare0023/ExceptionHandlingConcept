import java.util.Scanner;
// to handle specific error conditions or situations we use user defined exception
public class insufficientBalException extends RuntimeException {
   public insufficientBalException(String msg){
       System.out.println(msg);
   }
}
class cust{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double amt=sc.nextDouble();
        double withAmt=sc.nextDouble();

        System.out.println("Available Amt: "+amt);
        if(withAmt>amt)
        {
            throw new insufficientBalException("Exceeding the limit in the\n" +
                    "account");
        }
        else
        {
            System.out.println("Collect Amt");
            amt=amt-withAmt;
            System.out.println("After Withdraw Avl Bal:"+amt);
        }

    }



}
