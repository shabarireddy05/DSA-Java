package Patterns;
import java.util.Scanner;
public class eightpattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<2*n;i++){
        for(int j=1;j<n;j++){
            if((i==1 && (j==1 || j==n)) || 
               (i==n && (j==1 || j==n)) || 
               (i==n*2-1 && (j==1 || j==n))){
                System.out.print(" ");
               }
               else if(i==1 || i==n || i==(n*2)-1 || j==1 || j==n){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
        }
        System.out.println(" ");
    } 
}
}