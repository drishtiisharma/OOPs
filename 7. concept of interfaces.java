// to show the concept of interfacing between two classes

interface Animal{
    void eat();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dog eat bones");
    }
}

public class Main{
    public static void main(String[] args){
        Animal d=new Dog();
        d.eat();
    }
}