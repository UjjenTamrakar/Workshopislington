import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter two number");
        double a = scan.nextDouble();
        int b = scan.nextInt();
        
        System.out.println("First number: " + a );
        System.out.println("Second number: " + b);
        scan.close();
    }
}