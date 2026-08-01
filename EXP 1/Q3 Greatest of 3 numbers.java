import java.util.Scanner;
public class Greatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME: ANUSHKA MOHITE");
        System.out.println("PRN: 1262241339");
        System.out.println("   ");
    
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();
        System.out.println("Enter the thrid number: ");
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is the greatest number.");
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+" is the greatest number.");
        }
        else{
            System.out.println(n3+" is the greatest number.");
        }
    }
}

