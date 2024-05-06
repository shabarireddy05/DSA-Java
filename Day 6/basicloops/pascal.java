// Write a java program to print pascal's triangle up to n rows using loop.
// There are many definitions of Pascal's Triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown below.

// Or Pascal's triangle is a triangular array of binomial coefficients. 
// Input
// 5
// Output
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

import java.util.Scanner;

public class pascal {
    static long fact(int n) {
        long factorial = 1L;
        while (n >= 1) {
            factorial *= n;
            n--;
        }
        return factorial;
    }
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.println();
        for (int n = 0; n < rows; n++) {
            // Prints spaces
            for (int i = n; i < rows - 1; i++)
                System.out.print(' ');

            // Generate value for the current box
            for (int k = 0; k <= n; k++) {
                long value = fact(n) / (fact(k) * fact(n - k));
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
    }
 
