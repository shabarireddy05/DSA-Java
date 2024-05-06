package Patterns;
import java.util.Scanner;
public class hollowmirrorrighttraingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
         for(int sp=1;sp<=n-i;sp++){
            System.out.print(" ");
         }
         for(int st=1;st<=i;st++){
            if(st==n||i==n||st==i||st==1)
            System.out.print("*");
            else
            System.out.print(" ");
         }
         System.out.println(" ");
    }
}


}
