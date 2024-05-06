import java.util.Scanner;
public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int rev=0;
        while(n>0){
          rem=n%10;
          rev=rev*10+rem;
          n=n/10;
        }
        System.out.println("Reverse of a number:"+rev);
    }
}
        