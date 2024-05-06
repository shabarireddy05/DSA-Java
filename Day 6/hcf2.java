import java.util.Scanner;
 import java.lang.Math;
public class hcf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int num =  Math.min(A, B); num >= 1; num--) {
            if(A%num == 0 && B%num == 0) {
                System.out.println(num);
                break;
            }
        }
    }
}
