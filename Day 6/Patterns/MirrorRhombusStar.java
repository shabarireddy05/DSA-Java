package Patterns;
import java.util.Scanner;
public class MirrorRhombusStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=i-1;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=n;st++){
                System.out.print("*");
                }
            
           
             System.out.println(" ");
        }
       
    }

}    