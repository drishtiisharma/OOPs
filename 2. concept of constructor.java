//to show the concept of constructors in java
class Const{
    Const(){
        System.out.println("I am a default constructor in java");
    }
    Const(int x){
        System.out.println("I am a parameterized constructor in java "+x);
    }
}

public class Main{
    public static void main(String[] args){
        Const c1= new Const(); //default constructor
        Const c2=new Const(10); //parameterized constructor
    }
}
