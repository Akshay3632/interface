package inheritanceInterface;
class Employee {
    int id;
    String name;
    String department;
    double salary;

    // Default constructor
    public Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0.0;
    }

    // Parameterized constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept() {
        // Input details for an employee
        // You can use Scanner here to accept input, but for simplicity, we'll use hard-coded values
        id = 101;
        name = "John";
        department = "HR";
        salary = 50000.0;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Worker extends Employee {
    private double bonus;

    public Worker() {
        bonus = 0.0;
    }

    public void accept() {
        super.accept(); // Call the accept method of the superclass to input common details
        // Input bonus for the worker
        // You can use Scanner here to accept input, but for simplicity, we'll use a hard-coded value
        bonus = 2000.0;
    }

    public void display() {
        super.display(); // Call the display method of the superclass to display common details
        System.out.println("Bonus: " + bonus);
    }

    public double getTotalSalary() {
        return salary + bonus;
    }
}

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int n = 3; // Number of Worker objects
	        Worker[] workers = new Worker[n];

	        for (int i = 0; i < n; i++) {
	            workers[i] = new Worker();
	            workers[i].accept(); // Accept details for each worker
	        }

	        double maxTotalSalary = 0.0;
	        Worker maxSalaryWorker = null;

	        for (int i = 0; i < n; i++) {
	            workers[i].display(); // Display details for each worker
	            double totalSalary = workers[i].getTotalSalary();

	            if (totalSalary > maxTotalSalary) {
	                maxTotalSalary = totalSalary;
	                maxSalaryWorker = workers[i];
	            }
	        }

	        System.out.println("\nWorker with Maximum Total Salary:");
	        if (maxSalaryWorker != null) {
	            maxSalaryWorker.display();
	        }
	    }

	}

 
