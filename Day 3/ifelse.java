import java.util.Scanner;

class ifelse {
    public static void main(String[] args) {
        // you code goes here
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        int marks2 = sc.nextInt(); 

        // if-else
        if(marks >= 33 && marks2 >= 33) {
            System.out.println("Pass!");
        }
        else {
            System.out.println("Fail!");
        }
        // System.out.println("Last Line!");
    }
}