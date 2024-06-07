/* 
 * W.A.P. to find the largest number from given 3 numbers using conditional operator.
 */
import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one, two, three;
        one = sc.nextInt();
        two = sc.nextInt();
        three = sc.nextInt();
        System.out
                .println("Largest Number is : " + (one > two ? one > three ? one : three : two > three ? two : three));
        sc.close();
    }
}
