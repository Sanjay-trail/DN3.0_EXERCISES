import java.util.Arrays;

public class EmployeeManagement {
    private Employee[] employees;
    private int count;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            System.out.println("Employee added: " + employee);
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("Employee Records:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null; // Clear the last element
                System.out.println("Employee with ID " + employeeId + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagement empManager = new EmployeeManagement(5); // Capacity of 5 employees


        empManager.addEmployee(new Employee(1, "Alice Johnson", "Software Engineer", 75000.00));
        empManager.addEmployee(new Employee(2, "Bob Smith", "Project Manager", 85000.00));
        empManager.addEmployee(new Employee(3, "Charlie Brown", "Data Analyst", 65000.00));


        empManager.traverseEmployees();


        Employee foundEmployee = empManager.searchEmployee(2);
        if (foundEmployee != null) {
            System.out.println("Found Employee: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        empManager.deleteEmployee(2);
        empManager.traverseEmployees();
        empManager.deleteEmployee(4);
    }
}
