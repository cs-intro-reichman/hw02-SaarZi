/**
 * Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
    public static void main(String[] args) {
        // Put your code here
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            String s = "";
            if (i % 2 == 1) {
                s += " ";
            }
            for (int j = 0; j < n; j++) {
                s += "* ";
            }
            System.out.println(s);
        }
    }
}
