package oop.others;

public class Constructor {
    String name;
    int id;

    Constructor(int id, String name){
        this.id = id;
        this.name = name;
    }
}

// driver class
class ConstructorMain {
    public static void main(String[] args){
        Constructor con = new Constructor(213, "Sujan");
        System.out.println(con.id);
        System.out.println(con.name);
    }
}
