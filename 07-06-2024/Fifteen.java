
/* 
Create a program that would accept a string from the user and print a pattern. For example, if
the user enters “Hello”, it should print a pattern as follows:
H
He
Hel
Hell
Hello
 */
import java.util.*;

public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = "";
        System.out.print("Enter String : ");
        inp = sc.nextLine();
        for (int i = 0; i < inp.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(inp.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}
