import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rem;
        int rev=0;
        while(temp>0){
          rem=temp%10;
          rev=rev*10+rem;
          temp=temp/10;
        }
        if(n==rev){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        System.out.println("Reverse of a number:"+rev);
    }
}
        