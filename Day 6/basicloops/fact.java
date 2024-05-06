import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        long factorial = 1L;

        // Input number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to calculate factorial: ");
        int num = scanner.nextInt();

        // Run loop from 1 to num
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
