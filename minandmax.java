import java.util.Scanner;
public class minandmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;
        // Iterating over the array
        for (int i = 0; i < n; i++) {
            if(arr[i]<mn){
                mn=arr[i];
            }
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println("max element"+mn);
        System.out.println("min element"+mx);
    }
}
