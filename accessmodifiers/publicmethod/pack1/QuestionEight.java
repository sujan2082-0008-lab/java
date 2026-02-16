package oop.accessmodifiers.publicmethod.pack1;
public class QuestionEight {
    public void display() {
        System.out.println("Display method implementation");
        System.out.println("This method now has a body");
    }

    public static void main(String[] args) {
        QuestionEight obj = new QuestionEight();
        obj.display();
    }
}
