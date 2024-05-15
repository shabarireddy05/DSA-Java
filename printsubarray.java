import java.util.Scanner;
public class printsubarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
          for(int st=0;st<N;st++){
            for(int en=st;en<N;en++){
                for(int i=st;i<=en;i++){
                    System.out.print(arr[i]+" ");
                  
                }
                System.out.println();
            }
          }
    }
}

