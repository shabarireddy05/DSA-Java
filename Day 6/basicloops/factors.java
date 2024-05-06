
    import java.util.*;

public class factors {
    public static void main(String[] args) {
        // Input base and exponent from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Factors of " + num + " are: ");
        for (int i = 1; i <= Math.sqrt(num); i++){ 
            if (num % i == 0){ 
                // If divisors are equal, print only one 
                if (num / i == i) 
                    System.out.print(" "+ i); 
                else // Otherwise print both 
                    System.out.print(i + " " + num / i + " " ); 
            } 
        } 
    }
  }

