
/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
    public static void main(String[] args) {
        // Put your code here
        int sum = 0;
        boolean hasBoy = false;
        boolean hasGirl = false;
        while (!hasBoy || !hasGirl) {
            sum++;
            if (Math.random() < 0.5) {
                hasBoy = true;
                System.out.print("b ");
            } else {
                hasGirl = true;
                System.out.print("g ");
            }
        }
        System.out.println();
        System.out.println("You made it... and you now have " + sum + " children.");
    }
}
