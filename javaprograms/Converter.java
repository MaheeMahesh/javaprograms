import java.util.*;
public class Converter
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("feet -");
int a = sc.nextInt();
System.out.print("inch -");
int b = sc.nextInt();
System.out.print(" kg -");
int c = sc.nextInt();
double feet1 =12;
double inch1=2.54;
double kg1=2.2*c;
double k=(30.48*a)+(2.54*b);
double m=kg1;
System.out.println("height in cm=" +k);
System.out.println("weight in pounds="+m);
}
}