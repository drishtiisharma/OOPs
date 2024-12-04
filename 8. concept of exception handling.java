// to show the concept of exception handling

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner Scanner=new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int num=Scanner.nextInt();
            int result=10/num;
            System.out.println("Result: "+result);
        }
        
        catch(ArithmeticException e){
            System.out.println("Exception caught: division by 0!");
        }
        
        finally{
            System.out.println("This block will always be executed.");
        }
    }
}
