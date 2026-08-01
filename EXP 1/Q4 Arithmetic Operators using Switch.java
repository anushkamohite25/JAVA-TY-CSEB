import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the first number: ");
            int n1=sc.nextInt();
            System.out.println("Enter the second number: ");
            int n2=sc.nextInt();
            System.out.println("Choose any operator: (+,-,*,/,%)");
            char op=sc.next().charAt(0);
            int r=0;
            switch(op){
                case '+'->{
                    r=n1+n2;
                }
                case '-'->{
                    r=n1-n2;
                }
                case '*'->{
                    r=n1*n2;
                }
                case '/'->{
                    r=n1/n2;
                }
                case '%'->{
                    if(n2!=0){
                        r=n1%n2;
                    }
                }
            }
            System.out.println("Answer is: "+r);
        }
        
        System.out.println("   ");
        System.out.println("NAME: ANUSHKA MOHITE");
        System.out.println("PRN: 1262241339");
    }
}
