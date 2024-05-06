import java.util.Scanner;
public class volumeOfSphere{
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double r=sc.nextInt();
  double pi=3.1416;
  double vol=(4/3)*pi*r*r*r;

System.out.println("8Volume of sphere is:"+vol);
    }
}
