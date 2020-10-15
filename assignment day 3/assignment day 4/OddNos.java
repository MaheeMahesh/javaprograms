public class OddNos{
public static void main(String [] args){
int[] arr = new int[5];
System.out.println("The given numbers are:");
for(int i=0;i<arr.length;i++){
arr[i]=i+1;
System.out.println(arr[i]+" ");
}
System.out.println("\n The Odd Numbers are: ");
for(int i=0;i<arr.length;i++){
if(arr[i]%2!=0){
System.out.println(arr[i]+" ");
}
}
}
}