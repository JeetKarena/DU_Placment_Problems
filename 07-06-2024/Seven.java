public class Seven {
    public static void main(String[] args) {
        for (int i = 150; i <= 445; i++) {
            if (i % 7 == 0 && i % 3 != 0 && i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
