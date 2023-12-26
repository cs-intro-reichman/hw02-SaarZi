/**
 * Generates and prints random integers in the range [0,10),
 * as long as they form a non-decreasing sequence.
 */
public class InOrder {
    public static void main(String[] args) {
        // Write your code here
        int rand = (int) (Math.random() * 10);
        int prev = 0;
        while (rand >= prev) {
            System.out.print(rand + " ");
            prev = rand;
            rand = (int) (Math.random() * 10);
        }
    }
}
