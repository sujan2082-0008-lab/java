package oop.methods;

class Mobile{
    private String brand;

    Mobile(String brand){
        this.brand = brand;
    }

    void display(){
        System.out.println("Brand: "+this.brand);
    }
}

class SmartPhone extends Mobile{
    private String cameraMP;
    SmartPhone(String brand, String cameraMP){
        super(brand);
        this.cameraMP=cameraMP;
    }

    void displaySmartPhone(){
        super.display();
        System.out.println("Camera MP: "+this.cameraMP);
    }
}

public class MobileMain{
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone("Xiaomi","50MP");
        smartPhone.displaySmartPhone();
    }
}