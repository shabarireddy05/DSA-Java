import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=2*n-i;
            for(int j=1;j<=i;j++){
                System.out.print(k-i+1);
                k=k+2;
            }

            System.out.println(" ");
    }
}
}