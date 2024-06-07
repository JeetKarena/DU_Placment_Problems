
/* 
 Accept three integer values from the user and display them in ascending order using only
 operators (i.e. without using if…else, switch case, or loop).
 */
import java.util.*;

public class Thrteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int mid = (a + b + c) - (min + max);

        System.out.println("The numbers in ascending order are: " + min + " " + mid + " " + max);
    }
}
