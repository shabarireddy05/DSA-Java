package Patterns;
import java.util.Scanner;
public class print1and0cols {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
           if(j%2==1){
            System.out.print(1);
           }
           else{
            System.out.print(0);
           }
        }
        System.out.println(" ");

    }
}
}
