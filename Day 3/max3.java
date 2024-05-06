import java.util.Scanner;
public class max3 {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        int s1=f.nextInt();
        Scanner f1=new Scanner(System.in);
        int s2=f1.nextInt();
        Scanner f2=new Scanner(System.in);
        int s3=f2.nextInt();
        if(s1>s2 && s1>s3){
            System.out.println("s1 is higher");
        }
        else if(s2>s3 && s2>s1){
            System.out.println("s2 is higher");
        }
        else {
            System.out.println("s3 is higher");
        }

    }
}
