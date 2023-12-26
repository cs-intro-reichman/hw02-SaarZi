/**
 * Computes some statistics about families in which the parents decide
 * to have children until they have at least one child of each gender.
 * The program expects to get one command-line argument: an int value
 * that determines how many families to simulate.
 */
public class OneOfEachStats1 {
    public static void main(String[] args) {
        // Put your code here
        int T = Integer.parseInt(args[0]);

        double average = 0;
        int children2 = 0;
        int children3 = 0;
        int children4plus = 0;

        for (int i = 0; i < T; i++) {
            int sum = 0;
            boolean hasBoy = false;
            boolean hasGirl = false;
            while (!hasBoy || !hasGirl) {
                sum++;
                if (Math.random() < 0.5) {
                    hasBoy = true;
                } else {
                    hasGirl = true;
                }
            }

            average += sum;
            switch (sum) {
                case 2:
                    children2++;
                    break;
                case 3:
                    children3++;
                    break;
                default:
                    children4plus++;
            }
        }
        average /= T;
        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + children2);
        System.out.println("Number of families with 3 children: " + children3);
        System.out.println("Number of families with 4 or more children: " + children4plus);
        int max = (int) Math.max(Math.max(children2, children3), children4plus);
        System.out.println("The most common number of children is "
                + (children2 == max ? "2." : children3 == max ? "3." : "4 or more children."));
    }
}
