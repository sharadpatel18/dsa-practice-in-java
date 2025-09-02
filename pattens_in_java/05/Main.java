public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 6-i; j > 0; j--) {
                System.err.print("*");
            }
            System.out.println();
        }
    }
}