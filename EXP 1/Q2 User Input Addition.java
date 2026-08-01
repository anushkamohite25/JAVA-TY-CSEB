import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME: ANUSHKA MOHITE");
        System.out.println("PRN: 1262241339");
        System.out.println("   ");
        
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("Addition of "+n1+" and "+n2+" is " +sum);
    }
}
