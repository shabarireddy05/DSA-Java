package Patterns;
import java.util.Scanner;
public class printchessboardpattern {
    public static void main(String[] args) {
    
    int k=1;
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= cols; j++) {
            if (k == 1) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }

            // Alternate between 1 and 0
            k *= -1;
        }

        // Reverse the pattern if the number of columns is even
        if (cols % 2 == 0) {
            k *= -1;
        }

        System.out.println(" ");
    }

}
}
