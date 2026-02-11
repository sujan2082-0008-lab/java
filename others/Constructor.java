package oop.others;

public class Constructor {
    String name;
    int id;
    int grade;
    int age;
    long phone;

    Constructor(int id, String name, int grade, int age, long phone){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.phone = phone;
    }
}

// driver class
class ConstructorMain {
    public static void main(String[] args){
        Constructor con = new Constructor(213, "Sujan", 12, 17, 9768400136L);
        System.out.println(con.id);
        System.out.println(con.name);
        System.out.println(con.grade);
        System.out.println(con.age);
        System.out.println(con.phone);
    }
}
