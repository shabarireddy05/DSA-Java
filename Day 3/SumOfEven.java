import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        
    System.out.println("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();	
      
    int sum = 0;
    for(int i=2; i<=n; i+=2){  
       sum += i;  
    }   
     
     System.out.println("Total sum of even numbers: " + sum);  
  }
    
}
