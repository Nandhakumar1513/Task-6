package com.guvi;

public class Employee {
	private int id;
    private String firstname;
    private String lastname;
    private double salary;

    // Constructor
    public Employee(int id, String firstname, String lastname, double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Getter method for firstname
    public String getfistname() {
    	return firstname;
    }
    
    // Getter method for lastname
    public String getlastname() {
    	return lastname;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

	// Method to raise salary by a specified percentage
    public void raiseSalary(double percent) {
        salary = salary + (salary * (percent / 100));
    }
    
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ "]";
	}

	public static void main(String[] args) {
		 // Create a new Employee object
        Employee employee = new Employee(1, "John", "Doe", 50000.0);
        
        
        // Print initial salary
        System.out.println(employee.toString());

        // Raise salary by 12%
        employee.raiseSalary(12);

        // Print updated salary
        System.out.println(employee.toString());

	}

}
