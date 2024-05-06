
// Fibonacci series is a series of numbers where the current number is the sum of previous two terms. For Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, … , (n-1th + n-2th)

// Input
// 10
// Output
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

import java.util.Scanner;

public class fibannoci {
    public static void main(String[] args) {
    
        // Input number of terms from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        // Fibonacci magic initialization
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println("Fibonacci terms: ");

        // Iterate through n terms
        for (int i = 1; i <= terms; i++) {
            System.out.print(c + ", ");

            // Update variables for the next term
            a = b;      // Copy n-1 to n-2
            b = c;      // Copy current to n-1
            c = a + b;  // New term
        }
    }
}
