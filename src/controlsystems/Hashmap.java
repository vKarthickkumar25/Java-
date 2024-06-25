package controlsystems;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

public class Hashmap {

	    // Employee class
	    static class Employee {
	        private String name;
	        private int id;
	        private double salary;

	        public Employee(String name, int id, double salary) {
	            this.name = name;
	            this.id = id;
	            this.salary = salary;
	        }

	        public void printName() {
	            System.out.println("Employee Name: " + name);
	        }

	        public void printSalary() {
	            System.out.println("Employee Salary: " + salary);
	        }

	        // Getters and setters for name, id, and salary
	        public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public int getId() {
	            return id;
	        }

	        public void setId(int id) {
	            this.id = id;
	        }

	        public double getSalary() {
	            return salary;
	        }

	        public void setSalary(double salary) {
	            this.salary = salary;
	        }
	    }

	    // Method to test Employee class
	    public void employeeTest() {
	        Employee employee = new Employee("John Doe", 12345, 75000.0);
	        employee.printName();
	        employee.printSalary();
	    }

	    // Method to create an ArrayList of strings and remove all elements
	    public void arrayListExample() {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        System.out.println("ArrayList before removal: " + list);

	        list.clear();

	        System.out.println("ArrayList after removal: " + list);
	    }

	    // Method to create a TreeMap of employee IDs and names, and print names in alphabetical order
	    public void treeMapExample() {
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();
	        employeeMap.put(102, "Alice");
	        employeeMap.put(101, "Bob");
	        employeeMap.put(103, "Charlie");

	        System.out.println("Employee names in alphabetical order:");
	        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
	            System.out.println(entry.getValue());
	        }
	    }

	    // Method to convert a List to an array
	    public void listToArrayExample() {
	        List<String> list = new ArrayList<>();
	        list.add("One");
	        list.add("Two");
	        list.add("Three");

	        String[] array = new String[list.size()];
	        array = list.toArray(array);

	        System.out.println("Array elements:");
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }

	    // Main method to test all functionalities
	    public static void main(String[] args) {
	    	Hashmap multiFunctionClass = new Hashmap();

	        // Test Employee class
	        multiFunctionClass.employeeTest();
	        System.out.println();

	        // Test ArrayList example
	        multiFunctionClass.arrayListExample();
	        System.out.println();

	        // Test TreeMap example
	        multiFunctionClass.treeMapExample();
	        System.out.println();

	        // Test List to Array example
	        multiFunctionClass.listToArrayExample();
	    }
	}

