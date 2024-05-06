import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=n;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(k-i+1);
              k--;
            }
System.out.println(" ");
    }
}
}