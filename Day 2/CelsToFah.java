// Write a program the converts the input Celsius degree into its equivalent Fahrenheit degree.
//  Use the formula: F = (9/5) *C+32.

import java.util.Scanner;
class CelsToFah{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double c=sc.nextDouble();
    double fah=(((9/5)*c)+32);
    System.out.println("Fahrenheit:"+fah);

}
}