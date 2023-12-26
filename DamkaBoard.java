/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
        // Put your code here
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i % 2 == 0 ? "* " : " *");
            }
            System.out.println();
        }
    }
}
