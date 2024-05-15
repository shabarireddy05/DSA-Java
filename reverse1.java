import java.util.Scanner;
public class reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for size of the array
        int N = sc.nextInt();
        int arr[] = new int[N];

        // Input for N elements of the array
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Print in reverse order
        int i=0,j=N-1,temp;
        while(i<j){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        // Write the code to reverse the array
        // for(int i = 0; i < N/2; ++i) {
        //     int temp = arr[i];
        //     arr[i] = arr[N - 1 - i];
        //     arr[N - 1 - i] = arr[i];
        // }
             System.out.println("After reversing elements");
        for(int value:arr){
            System.out.print( value + " ");
        }
    }
}
