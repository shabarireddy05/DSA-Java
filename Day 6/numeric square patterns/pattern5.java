import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        
        int k=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==j)
            {
                 System.out.print(k);
                 k--;
            }
            }
            System.out.println(" ");
        }
    }
    }
    
