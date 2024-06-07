
/* 
 Accept two integers from the user and calculate the sum of last digits of both the integers. For
example, if the numbers are 27 and 459, then the sum of last digits would be 16 (i.e. 7 + 9).
 */
import java.util.*;;

public class Twel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter Number One : ");
        num1 = sc.nextInt();
        System.out.print("Enter Number Two : ");
        num2 = sc.nextInt();
        System.out.println("Sum Of last Digit is : " + (num1 % 10 + num2 % 10));
        sc.close();
    }
}
