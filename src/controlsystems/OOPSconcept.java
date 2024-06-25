package controlsystems;

public class OOPSconcept {
	public class MultiFunctionClass {

	    // 1. Person Class
	    public static class Person {
	        private String name;
	        private int age;

	        public Person(String name, int age) {
	            this.name = name;
	            this.age = age;
	        }

	        public String getName() {
	            return name;
	        }

	        public int getAge() {
	            return age;
	        }
	    }

	    // 2. Employee Class
	    public static class Employee {
	        private int id;
	        private String firstName;
	        private String lastName;
	        private int salary;

	        public Employee(int id, String firstName, String lastName, int salary) {
	            this.id = id;
	            this.firstName = firstName;
	            this.lastName = lastName;
	            this.salary = salary;
	        }

	        public int getID() {
	            return id;
	        }

	        public String getFirstName() {
	            return firstName;
	        }

	        public String getLastName() {
	            return lastName;
	        }

	        public String getName() {
	            return firstName + " " + lastName;
	        }

	        public int getSalary() {
	            return salary;
	        }

	        public void setSalary(int salary) {
	            this.salary = salary;
	        }

	        public int getAnnualSalary() {
	            return salary * 12;
	        }

	        public int raiseSalary(int percent) {
	            salary += salary * percent / 100;
	            return salary;
	        }

	        @Override
	        public String toString() {
	            return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
	        }
	    }

	    // 3. Circle Class
	    public static class Circle {
	        private double radius;

	        public Circle() {
	            this.radius = 1.0;
	        }

	        public Circle(double radius) {
	            this.radius = radius;
	        }

	        public double getRadius() {
	            return radius;
	        }

	        public void setRadius(double radius) {
	            this.radius = radius;
	        }

	        public double getCircumference() {
	            return 2 * Math.PI * radius;
	        }
	    }

	    // 4. Account Class
	    public static class Account {
	        private double balance;

	        public Account() {
	            this.balance = 0.0;
	        }

	        public Account(double balance) {
	            this.balance = balance;
	        }

	        public double getBalance() {
	            return balance;
	        }

	        public void deposit(double amount) {
	            if (amount > 0) {
	                balance += amount;
	            }
	        }

	        public void withdraw(double amount) {
	            if (amount > 0 && amount <= balance) {
	                balance -= amount;
	            }
	        }
	    }

	    // 5. Tea Class and Subclasses
	    public static class Tea {
	        public void prepareTea() {
	            System.out.println("Preparing tea with hot water and tea leaves.");
	        }

	        public void addMilk() {
	            System.out.println("Adding milk to the tea.");
	        }

	        public void addSugar() {
	            System.out.println("Adding sugar to the tea.");
	        }
	    }

	    public static class BlackTea extends Tea {
	        @Override
	        public void prepareTea() {
	            System.out.println("Preparing black tea with hot water and black tea leaves.");
	        }
	    }

	    public static class GreenTea extends Tea {
	        @Override
	        public void prepareTea() {
	            System.out.println("Preparing green tea with hot water and green tea leaves.");
	        }
	    }

	    public static class HerbalTea extends Tea {
	        @Override
	        public void prepareTea() {
	            System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
	        }
	    }

	    // Method to demonstrate polymorphism
	    public static void demonstratePolymorphism() {
	        Tea[] teas = { new Tea(), new BlackTea(), new GreenTea(), new HerbalTea() };

	        for (Tea tea : teas) {
	            tea.prepareTea();
	            tea.addMilk();
	            tea.addSugar();
	            System.out.println();
	        }
	    }

	    // Main method to test all functionalities
	    public static void main(String[] args) {
	        // Testing Person class
	        Person person = new Person("John Doe", 30);
	        System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());

	        // Testing Employee class
	        Employee employee = new Employee(1, "Jane", "Doe", 50000);
	        System.out.println(employee);
	        employee.raiseSalary(10);
	        System.out.println("After raise: " + employee);

	        // Testing Circle class
	        Circle circle = new Circle(5.0);
	        System.out.println("Circle Radius: " + circle.getRadius() + ", Circumference: " + circle.getCircumference());

	        // Testing Account class
	        Account account = new Account(1000.0);
	        account.deposit(500);
	        account.withdraw(200);
	        System.out.println("Account Balance: " + account.getBalance());

	        // Demonstrate polymorphism with Tea and its subclasses
	        demonstratePolymorphism();
	    }
	}

}
