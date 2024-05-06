import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=2*i-1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(k);
                k=k+2;
            }

            System.out.println(" ");
    }
}
}


