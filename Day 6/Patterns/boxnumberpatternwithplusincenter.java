package Patterns;
import java.util.Scanner;
public class boxnumberpatternwithplusincenter {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows");
    int rows=sc.nextInt();
    System.out.println("Enter no of cols");
    int cols=sc.nextInt();
    int centerRow = (rows + 1) / 2;
    int centerCol = (cols + 1) / 2;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=cols;j++){
            if(centerRow==i||centerCol==j){
                System.out.print("0");
            }
            else if((cols % 2 == 0 && centerCol + 1 == j) || (rows % 2 == 0 && centerRow + 1 == i)){
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }
        }
        System.out.println(" ");
    } 
}
}
