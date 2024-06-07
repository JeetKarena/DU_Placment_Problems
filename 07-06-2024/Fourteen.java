
/* 
 Accept a positive number from the user and print a message stating whether the number
 entered is even or odd WITHOUT using the module (%)operator and if... else statements.
 */
import java.util.*;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Using bitwise AND operator to check the least significant bit
        String result = (number & 1) == 0 ? "even" : "odd";

        System.out.println("The number entered is " + result + ".");
    }
}
