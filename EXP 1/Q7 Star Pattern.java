import java.util.Scanner;
public class StarPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println(" ");
        System.out.println("NAME: ANUSHKA MOHITE");
        System.out.println("PRN: 1262241339");
    }
}

