/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        // Put your code here
        String s = args[0];
        String sOut = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sOut += s.charAt(i);
        }
        System.out.println(sOut);
        System.out.println("The middle character is " + (s.charAt(s.length() / 2)));
    }
}
