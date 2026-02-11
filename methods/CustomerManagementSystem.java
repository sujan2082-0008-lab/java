package oop.methods;
import java.util.Scanner;
public class CustomerManagementSystem {
    int id;
    double total;
    String name;
    long contact;
    CustomerManagementSystem(int id, String name, double total, long contact){
        this.id =id;
        this.name =name;
        this.total =total;
        this.contact =contact;
    }
}

class Input{
    public static void main(String[] args){
        int id,count = 0;
        double total;
        String name;
        long contact;
        char choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ==== Customer Management System ====");
        do {
            System.out.print("\nEnter customer's id: ");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter customer's name: ");
            name = scanner.nextLine();
            System.out.print("Enter customer's contact: ");
            contact = scanner.nextLong();
            System.out.print("Enter customer's total: ");
            total = scanner.nextDouble();
            System.out.println("Do you want to add more(Y/N)? ");
            choice = scanner.next().charAt(0);
            choice = Character.toLowerCase(choice);
            count ++;
        }while(choice == 'y');
        scanner.close();
        CustomerManagementSystem cms = new CustomerManagementSystem(id,name,total,contact);

        System.out.println(" ==== Customers Records ==== ");
        for(int i=0; i<count; i++) {
            System.out.println("\nCustomer ID: " + cms.id);
            System.out.println("Customer name: " + cms.name);
            System.out.println("Customer contact: " + cms.contact);
            System.out.println("Customer total: " + cms.total + "$.");
        }
    }
}