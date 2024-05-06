import java.util.*;

public class lcm {
    public static void main(String[] args) {
        int lcm = 1;

        // Input two numbers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any two numbers to find LCM: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Find the maximum between num1 and num2
        int max = (num1 > num2) ? num1 : num2;

        // First multiple to be checked
        int i = max;

        // Run loop indefinitely until LCM is found
        while (true) {
            if (i % num1 == 0 && i % num2 == 0) {
                // If 'i' divides both 'num1' and 'num2', then 'i' is the LCM
                lcm = i;

                // Terminate the loop after LCM is found
                break;
            }

            // If LCM is not found, generate the next multiple of max between both numbers
            i += max;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}
