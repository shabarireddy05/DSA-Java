package Patterns;
import java.util.Scanner;
public class diamondpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=1;
        int spaces=n-1;
        int i,j;
        for( i=0;i<2*n;i++){
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(j=1;j<2*stars;j++){
             System.out.print("*");
            }
            System.out.println(" ");
            if(i<n){
                stars++;
                spaces--;
            }
            else
        {
            spaces++;
            stars--;
        }
    }
        }
}

