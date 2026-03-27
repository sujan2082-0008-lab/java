package oop.others;

public class ExampleOfConstructor {
    int id ;
    String name;
    String address;
    int marks;

    ExampleOfConstructor(int id, String name, String thau, int marks) {
        this.id = id;
        this.name = name;
        address = thau; // if you don't wanna use this keyword
        this.marks = marks;
    }
    void display(){
        System.out.println("Your id is: "+id);
        System.out.println("Your name is: "+name);
        System.out.println("Your address is: "+address);
        System.out.println("Your marks is: "+marks);
    }
}

class MainWala{
    public static void main(String[] args){
        ExampleOfConstructor ex = new ExampleOfConstructor(1,"Sujan Dangol","Khokana",99); //yo banna sath constructor run vaisakxa
        ex.display();
        ex.name="Rajan";
        System.out.println(ex.name);
    }
}