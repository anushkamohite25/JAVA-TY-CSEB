import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start=sc.nextInt();
        System.out.print("Enter the last number: ");
        int end=sc.nextInt();
        int sum=0;
        for (int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
        
        System.out.println(" ");
        System.out.println("NAME: ANUSHKA MOHITE");
        System.out.println("PRN: 1262241339");
    }
}
