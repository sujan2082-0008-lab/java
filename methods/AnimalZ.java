package oop.methods;

public class AnimalZ{
    void eat(){
        System.out.println("Animal is Eating.");
    }
}

class DogZ extends AnimalZ{
    void bark(){
        System.out.println("Dog is Barking.");
    }
}

class Puppy extends DogZ{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}

class PuppyMain{
    public static void main(String[] args){
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
