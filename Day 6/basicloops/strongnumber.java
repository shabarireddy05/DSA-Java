// Strong number is a special number whose sum of factorial of digits is equal to the original number.

// For example: 145 is strong number. Since, 1! + 4! + 5! = 145,

import java.util.Scanner;
public class strongnumber {
    public static void main(String[] args) {
        // Input upper limit from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int end = scanner.nextInt();

        System.out.println("All Strong numbers between 1 to " + end + " are:");

        // Iterate from 1 to end
        for (int i = 1; i <= end; i++) {
            // Number to check for a strong number
            int cur = i;

            long sum = 0;

            // Find the sum of factorial of digits
            while (cur > 0) {
                long fact = 1L;
                int lastDigit = cur % 10;

                // Find factorial of the last digit of the current number
                for (int j = 1; j <= lastDigit; j++) {
                    fact = fact * j;
                }

                sum += fact;

                cur /= 10;
            }

            // Print 'i' if it is a strong number
            if (sum == i) {
                System.out.print(i + ", ");
            }
        }
    }
}
