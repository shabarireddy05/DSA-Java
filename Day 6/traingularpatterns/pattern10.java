import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=n;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k--;
            }
           
System.out.println(" ");
    }
}
}