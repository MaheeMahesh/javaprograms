import java.util.Scanner;
public class Percentage2 {
public static void main(String[] args) 
{
int mark1, mark2, mark3, mark4,mark5;
Scanner sc= new Scanner(System.in);
		
System.out.println("Enter marks of 5 subject out of 100 ");

mark1=sc.nextInt();
mark2=sc.nextInt();
mark3=sc.nextInt();
mark4=sc.nextInt();
mark5=sc.nextInt();
int fullmark= 500;
int total= mark1 + mark2 + mark3 + mark4 + mark5;
		
float percentage = (total  * 100) / fullmark;
		
if(percentage >= 90.0) {
System.out.println("You have A grade with "+ percentage + "%");	
}
else if(percentage < 90.0 && percentage >= 80.0) {
System.out.println("You have B grade with "+ percentage + "%");
}
else if(percentage < 80.0 && percentage >= 70.0) {
System.out.println("You have C grade with "+ percentage + "%");
}
else if(percentage < 70.0 && percentage >= 60.0) {
System.out.println("You have C grade with "+ percentage + "%");
}
else if(percentage < 60.0) {
System.out.println("You have D grade with "+ percentage + "%");
}
}

}