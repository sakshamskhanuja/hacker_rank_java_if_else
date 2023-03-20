import java.util.Scanner;

public class Main {

    public static void main(String[] ss) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Stores a number.
            int n = Integer.parseInt(scanner.nextLine());

            // Conditions according to task.
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a whole number.");
        }
    }
}
