import java.util.*;
public class RestaurantBill
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter first price- ");
float a = sc.nextInt();
System.out.print("Enter second price - ");
float b = sc.nextInt();
System.out.print("Enter third price - ");
float c = sc.nextInt();
System.out.print("Enter tax % - ");
float f=sc.nextInt();
System.out.print("Enter Final Amount  - ");
float k=a+b+c+f;
System.out.println("Final Amount= " +k); 
}
}