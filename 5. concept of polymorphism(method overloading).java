// to show the concept of polymorphism: method overloading

class Exp{
    void display(int a,int b){
        System.out.println("Sum of integers: "+(a+b));
    }
    void display(double a,double b){
        System.out.println("Sum of doubles: "+(a+b));
    }
}

public class Main{
    public static void main(String[] args){
        Exp e=new Exp();
        
        e.display(5,10);
        e.display(5.1,10.1);
    }
}