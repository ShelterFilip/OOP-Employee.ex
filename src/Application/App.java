package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nam = sc.nextLine();
            System.out.print("Salary: ");
            double sa = sc.nextDouble();

            Employee emp = new Employee(id, nam, sa);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int m = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == m).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
            System.out.println();
            System.out.println("List of employees: ");
            for (Employee c : list) {
                System.out.println(c);
            }
        } else {

            System.out.print("Enter the percentage: ");
            double per = sc.nextDouble();
            emp.adition(per);

            System.out.println();
            System.out.println("List of employees: ");
            for (Employee c : list) {
                System.out.println(c);
            }
        }

        sc.close();
    }

}
