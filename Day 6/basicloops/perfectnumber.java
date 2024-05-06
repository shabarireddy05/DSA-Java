// Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

// For example: 6 is the first perfect number
// Proper divisors of 6 are 1, 2, 3
// Sum of its proper divisors = 1 + 2 + 3 = 6.
// Hence 6 is a perfect number.
import java.util.*;
public class perfectnumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int start = scanner.nextInt();
        System.out.print("Enter upper limit: ");
        int end = scanner.nextInt();

        System.out.println("All Perfect numbers between " + start + " to " + end + ":");

        // Iterate from start to end
        for (int i = start; i <= end; i++) {
            int sum = 0;

            // Check whether the current number i is a Perfect number or not
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            // If the current number i is a Perfect number
            if (sum == i) {
                System.out.print(i + ", ");
            }
        }
 }
}
