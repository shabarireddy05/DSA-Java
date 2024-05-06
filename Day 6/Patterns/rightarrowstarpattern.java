package Patterns;
import java.util.Scanner;
public class rightarrowstarpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=n;
        int spaces=0;
        int i,j;
        // print upper part
        for( i=1;i<=n;i++){
            for(j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            for(j=1;j<=stars-i+1;j++){
             System.out.print("*");
            }
            
            System.out.println(" ");
        }
        for(i=1; i<n; i++){
            for(j=1; j<=(2*n- 2*i); j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");

        }

    }
}