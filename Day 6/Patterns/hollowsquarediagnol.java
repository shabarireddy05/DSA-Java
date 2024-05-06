package Patterns;
/*
             * Print star for, 
             * first row (i==1) or 
             * last row (i==N) or
             * first column (j==1) or
             * last column (j==N) or 
             * row equal to column (i==j) or 
             * column equal to N-row (j==N-i+1)
             */
import java.util.Scanner;
public class hollowsquarediagnol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| i==n || j==1||j==n || i==j||j==n-i+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        
       } 
    }
