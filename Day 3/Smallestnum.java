import java.util.Scanner;
public class Smallestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        int smallest=first;
        if(second<smallest){
            smallest=second;
        }
        if (third < smallest) {
            smallest = third;
          }
   
          System.out.println("The smallest number is " +smallest);
       
    }
}

