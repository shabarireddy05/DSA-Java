import java.util.Scanner;
public class printAlphabets {
    public static void main(String[] args) {
        System.out.println("Alphabets from a to z are:");
 
        // Using for loop to traverse each character.
        for (char i = 'a'; i <= 'z'; i++) {
            // Print the alphabet
            System.out.printf("%c ", i);
        }
    }
}
