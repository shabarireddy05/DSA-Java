import java.util.Scanner;
public class Largestnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        int largest=first;
        if(second>largest){
            largest=second;
        }
        if (third > largest) {
            largest = third;
          }
   
          System.out.println("The largest number is " +largest);
       
    }
}
