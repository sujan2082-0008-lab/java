package oop.others;

public class NewEncapsulation {
        private String name;
        private int studentID;

        public String getName() {
            //validation code
            return name;
        }

        public void setName(String name) {
            //validation code
            this.name = name;
        }

        public int getStudentID() {
            //validation code
            return studentID;
        }

        public void setStudentID(int studentID) {
            //validation code
            this.studentID = studentID;
        }
    }

    class StudentMain{
    public static void main(String[] args) {
        NewEncapsulation std = new NewEncapsulation();
        System.out.println(std.getName());
        std.setName("Shree");
        System.out.println(std.getName());
    }
}


