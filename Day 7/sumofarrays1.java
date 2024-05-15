import java.util.Scanner;
public class sumofarrays1{
public static void main(String[] args) {
    int size, sum = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    size=sc.nextInt();
  
    int arr[] = new int[size];
    // for(int i=0;i<size;i++){
    //     arr[i]=sc.nextInt();
    //     sum=sum+arr[i];
    
    // }
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }

    for(int num:arr){
        sum=sum+num;
        
    }

    System.out.println("Sum is: "+sum);
}
}