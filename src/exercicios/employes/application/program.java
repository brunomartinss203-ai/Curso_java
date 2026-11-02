package exercicios.employes.application;

import exercicios.employes.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static  void main(String[] args){
        List<Employee> listemployes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered ?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(listemployes,id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary :");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            listemployes.add(employee);
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Employee emp = listemployes.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
       // Integer pos = position(listemployes,idsalary);
        if (emp == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : listemployes){
            System.out.println(e);
        }
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
