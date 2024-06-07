
/* 
 * W.A.P. to read n numbers in an array and remove the duplicates from an array.
 */
import java.util.*;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int number : array) {
            set.add(number);
        }
        for (int integer : set) {
            System.out.println(integer);
        }
        scanner.close();
    }
}
