package oop.methods;

public class EmployeeManagement{
    private String name;
    private double salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public void displayEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Developer extends EmployeeManagement{
    private String programmingLanguage;

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage=programmingLanguage;
    }

    public static void main(String[] args){
        Developer dv = new Developer();
        dv.setName("Sujan Dangol");
        dv.setSalary(1230000);
        dv.setProgrammingLanguage("Java");
        dv.displayEmployee();
        System.out.println("Programming Language: "+dv.getProgrammingLanguage());
    }

}
