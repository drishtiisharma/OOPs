//to show the concept of class in java

class Calculator{
    void add(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    void sub(int a, int b){
        System.out.println("Difference: "+ (a-b));
    }
    void mul(int a, int b){
        System.out.println("Product: "+(a*b));
    }
    void div(int a,int b){
        System.out.println("Division: "+(a/b));
    }
    void mod(int a, int b){
        System.out.println("Mod: "+(a%b));
    }
}

public class Main{
    public static void main(String[] args){
        int a, b;
        Calculator cal=new Calculator();
        cal.add(10,20);
        cal.sub(30,20);
        cal.mul(12,12);
        cal.div(8,4);
        cal.mod(9,2);
    }
}
