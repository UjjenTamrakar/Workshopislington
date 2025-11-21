import java.util.Scanner;

public class RickshawFare {
 public static void main(String[] args){
     
    double pricekm = 50.5;
    double pricemin = 5.2;
    
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Distance in km");
    double km = scan.nextDouble();
    System.out.println("Time in minutes");
    double time = scan.nextDouble();
    scan.nextLine();
    System.out.println("Is the passenger local?");
    String customer = scan.nextLine();
    System.out.println("Is it night time?");
    String st = scan.nextLine();
    
    double fare = km * pricekm + time * pricemin;
    
    if(customer.equals("yes")){
        fare = fare * 0.5;
    }
    else{
        fare = fare * 1;
    }
    
    if(st.equals("yes")){
        fare = fare * 1.5;
    }
    else{
        fare = fare * 1;
    }
    
    System.out.println("Total price in RS: " + fare);  
    
    
    
    
    
    
    
    }
 
     
    
    
    
    


}