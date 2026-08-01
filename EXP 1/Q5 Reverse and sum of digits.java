import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int sum=0;
        while (temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            sum=sum+digit;
            temp=temp/10;
        }
        System.out.println("Reversed Number: "+rev);
        System.out.println("Sum of Digits: "+sum);
        System.out.println(" ");
        System.out.println("NAME: ANUSHKA MOHITE");
        System.out.println("PRN: 1262241339");
    }
}
