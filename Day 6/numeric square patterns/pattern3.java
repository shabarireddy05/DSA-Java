import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows");
    int rows=sc.nextInt();
    System.out.println("Enter no of cols");
    int cols=sc.nextInt();
    int k;
    for(int i=1;i<=rows;i++){
        k=i;
        for(int j=1;j<=cols;j++){
            
            System.out.print(k);
            k++;
        }
        System.out.println(" ");
    }
}
}
