import java.util.Scanner;

public class Scannerc {
   public static void main(String[] args){ 
    
    
    int quantity= 5;
    
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number");
    
    int firstNum= input.nextInt();
    System.out.println("My first number: "+ firstNum );
    
    System.out.println("Enter second number");
    double secondNum= input.nextDouble();
    System.out.println("My second number is :"+ secondNum);
    
    
    System.out.println("Ask for his/her age : ");
    int age= input.nextInt();
    
    String isValid = (age >= 18)? "Driving is allowed" : "Driving is not allowed" ;
    System.out.println(isValid);
    
    
    }

}