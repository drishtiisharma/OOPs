// to show the concept of inheritance

class Animal{
    void sound(){
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows.");
    }
}

public class Main{
    public static void main(String[] args){
        Animal a=new Animal();
        Dog d=new Dog();
        Cat c=new Cat();
        
        a.sound();
        d.sound();
        c.sound();
    }
}
