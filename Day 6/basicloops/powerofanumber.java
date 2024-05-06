import java.util.*;
public class powerofanumber {
    public static void main(String[] args) {
        long power = 1;

        // Input base and exponent from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        // Multiply base, exponent times
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println(base + " ^ " + exponent + " = " + power);
    }
  }