package oop.methods;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
        else{
            System.out.println("Salary cannot be negative");
        }
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Salary: "+salary);
    }

    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.setEmployeeId(1);
        emp1.setEmployeeName("Subash cutie <33");
        emp1.setSalary(50000);
        Employee emp2 = new Employee();
        emp2.setEmployeeId(13);
        emp2.setEmployeeName("Ram maharjan");
        emp2.setSalary(-98000);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
