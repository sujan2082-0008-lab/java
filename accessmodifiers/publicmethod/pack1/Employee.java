package oop.accessmodifiers.publicmethod.pack1;

public class Employee {
    private double salary;

    private void calculateSalary() {
        salary = salary + (salary * 0.10);
        System.out.println("Final salary after 10% bonus: " + salary);
    }

    public Employee(double salary) {
            this.salary = salary;
    }

    public void processSalary() {
        System.out.println("Initial salary: " + salary);
        calculateSalary();
    }

    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        emp.processSalary();
    }
}
