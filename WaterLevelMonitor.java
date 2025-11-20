import java.util.Scanner;

public class WaterLevelMonitor{ 
    public static void main(String[] args){
        
        Scanner water = new Scanner(System.in);
        

        System.out.println("enter water level");
        
        double level = water.nextDouble();
        
        String isWarn = (level >= 1000)? "Warning" : "Normal";
        System.out.println(isWarn);
        
        
        
    
    
    
    
    
    
    }


}