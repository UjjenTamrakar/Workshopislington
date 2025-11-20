public class MathOperations{
    public static void main(String[] args){
        //arithmetic
        int a = 2;
        int b = 4;
        
        System.out.println(a+b);
        
        //unary
        
        System.out.println(++a);
        System.out.println(b++);
        
        // assignment
        
        b = a;
        
        // logical
        
        System.out.println( a > b);
        
        
        // relational
        
        if(a>b){
            System.out.println(a + " is greater than b ");
        }
        
        // ternary
        
        int age = 12;
        
        String result = (age >= 18) ? "Adult" : "Minor";
    }
}