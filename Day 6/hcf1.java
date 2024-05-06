import java.util.Scanner;
import java.lang.Math;



class hcf1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 1;
        for(int num = 1; num <= Math.min(A, B); num++) {
            if(A%num == 0 && B%num == 0)
                ans = num;
        }
        System.out.println(ans);
    }
}