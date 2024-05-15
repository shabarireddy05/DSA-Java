import java.util.Scanner;
public class medianofsortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
     int sum=0;
      for(int val : arr)
            sum=sum+val;
            System.out.println("Sum"+sum);
            for(int i=0;i<N;i++){
                if(arr[i]<arr[i+1]){
                    System.out.println("Median"+(sum/N));
                }
                else{
                    System.out.println("Not sorted");
                }
            }
           
        sc.close();
    }
}