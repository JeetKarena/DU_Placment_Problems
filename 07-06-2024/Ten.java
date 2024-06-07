import java.util.*;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int raw = sc.nextInt();
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < raw; j++) {
                if (i == 0 || j == 0 || i == raw - 1 || j == raw - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
