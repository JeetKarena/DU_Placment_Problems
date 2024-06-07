
/* 
 An electricity board charges the following rates for the use of electricity: For the first 200 units
80 paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit.
All users are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs.
300 then an additional surcharge of 12.36% of total amount is charged. W.A.P. to read the
number of units consumed and print out the bill amount.
 */
import java.util.*;

public class Elevan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        scanner.close();

        double billAmount = 100;
        if (units > 300) {
            billAmount += (200 * 0.8) + (100 * 0.9) + ((units - 300) * 1);
        } else if (units > 200) {
            billAmount += (200 * 0.8) + ((units - 200) * 0.9);
        } else {
            billAmount += units * 0.8;
        }

        if (billAmount > 300) {
            billAmount += billAmount * 0.1236;
        }

        System.out.printf("The total bill amount is: Rs. %.2f\n", billAmount);
    }
}
