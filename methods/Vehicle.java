package oop.methods;

public class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }
}

class Bike extends Vehicle{
    String model;

    Bike(String brand,String model){
        super(brand);
        this.model = model;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }

    public static void main(String[] args){
        Bike bike = new Bike("Yamaha","R15");
        bike.display();

    }
}