// to show the concept of adding a class to a package

// format:
/// mat
//// Calc
//// Main

// mat/Calc.java
package mat;
public class Calc{
    public int add(int a, int b){
        return a+b;
    }
}

//Main.java
import mat.Calc;
public class Main{
    public static void main(String[] args){
        Calc c=new Calc();
        
        int sum=c.add(5,10);
        System.out.println("Sum is: "+sum);
    }
}
