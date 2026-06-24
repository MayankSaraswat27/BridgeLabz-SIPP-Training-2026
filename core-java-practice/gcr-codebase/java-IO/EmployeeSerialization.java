import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {

    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId,
             String name,
             String department,
             double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp =
                    new Employee(id, name, dept, salary);

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.dat"));

            oos.writeObject(emp);
            oos.close();

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("employee.dat"));

            Employee recovered =
                    (Employee) ois.readObject();

            ois.close();

            System.out.println("\nRecovered Employee Information");
            System.out.println("ID: " + recovered.employeeId);
            System.out.println("Name: " + recovered.name);
            System.out.println("Department: " + recovered.department);
            System.out.println("Salary: " + recovered.salary);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}