package Patterns;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=n-i+1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(k);
                k++;
            }

            System.out.println(" ");
    }
}
}


