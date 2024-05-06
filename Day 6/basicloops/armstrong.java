import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to check Armstrong number: ");
        int num = scanner.nextInt();

        int sum = 0;

        // Copy the value of num for processing
        int originalNum = num;

        // Find total digits in num
        int digits = (int) Math.log10(num) + 1;

        // Calculate sum of power of digits
        while (num > 0) {
            // Extract the last digit
            int lastDigit = num % 10;

            // Compute sum of power of last digit
            sum = sum + (int) Math.pow(lastDigit, digits);

            // Remove the last digit
            num = num / 10;
        }

        // Check for Armstrong number
        if (originalNum == sum) {
            System.out.println(originalNum + " is ARMSTRONG NUMBER");
        } else {
            System.out.println(originalNum + " is NOT ARMSTRONG NUMBER");
        }
    }
}
