package oop.methods;
public class StudentManagement{
    private int studentId;
    private String studentName;
    private int marks;

    public int getId(){
        return studentId;
    }

    public void setId(int studentId){
        this.studentId = studentId;
    }

    public String getName(){
        return studentName;
    }

    public void setName(String studentName){
        this.studentName = studentName;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public void displayStudentDetails(){
        System.out.println("Student Id: "+studentId);
        System.out.println("Student name: "+studentName);
        System.out.println("Student marks: "+marks);
    }

    public static void main(String[] args){
        StudentManagement student = new StudentManagement();
        student.setId(1);
        student.setName("Subash motey");
        student.setMarks(100);
        student.displayStudentDetails();
    }
}