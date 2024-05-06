package Patterns;
import java.util.Scanner;
public class printboxpattwithplusincenter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int centerrow=(n+1)/2;
    int centercol=(n+1)/2;
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
           if(i==1||i==n||j==1||j==n){
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
