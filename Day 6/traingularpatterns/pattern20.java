import java.util.Scanner;
public class pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
        
            for(int j=1;j<=i;j++){
                if(i==1||i==n||j==1||j==i){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                k++;
            }

            System.out.println(" ");
    }
}
}

