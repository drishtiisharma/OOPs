// to show the concept of polymorphism: method overriding

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Main{
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d=new Dog();
        
        a.sound();
        d.sound();
    }
}
