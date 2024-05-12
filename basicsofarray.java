import java.util.*;
public class basicsofarray {
    public static void main(String[] args) {
        //declaring and instantiating in different lines
        //int arr[];
        //arr[]=new int[size];
        int arr[] = {1,2,3,4,5};
        for(int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    
    System.out.print("\n"); // just an enter character
    int arr2[] = new int[5];

        arr2[0] = 10; arr2[1] = 5; arr2[2] = 12; arr2[3] = 40;
        for(int value : arr2) {
            System.out.print(value + " ");
        }
        System.out.print("\n"); // just an enter character
        // toString()
        System.out.println("After converting into string:"+Arrays.toString(arr2));

        // sort()
        Arrays.sort(arr2);
        System.out.println("After converting into sort:"+Arrays.toString(arr2));

        // fill()
        // for(int i = 0; i < arr.length; ++i) 
        //     arr[i] = 10; Don't want to do this.
        Arrays.fill(arr2, -1);
        System.out.println("After converting into fill:"+Arrays.toString(arr2));
}
}
