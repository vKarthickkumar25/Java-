package controlsystems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public class Javaexceptions {

	    // Method to explain access modifiers
	    public void explainAccessModifiers() {
	        System.out.println("Access Modifiers in Java:");
	        System.out.println("1. public: Accessible from any other class.");
	        System.out.println("2. protected: Accessible within its own package and by subclasses.");
	        System.out.println("3. default: Accessible only within its own package.");
	        System.out.println("4. private: Accessible only within its own class.");
	    }

	    // Method to explain the difference between Exception and Error
	    public void explainExceptionAndError() {
	        System.out.println("Exception vs. Error:");
	        System.out.println("Exception: Recoverable conditions that can be handled programmatically (e.g., IOException, SQLException).");
	        System.out.println("Error: Irrecoverable conditions that usually indicate a problem with the JVM (e.g., OutOfMemoryError, StackOverflowError).");
	    }

	    // Method to explain the difference between checked and unchecked exceptions
	    public void explainCheckedAndUncheckedExceptions() {
	        System.out.println("Checked Exception vs. Unchecked Exception:");
	        System.out.println("Checked Exception: Checked at compile-time (e.g., IOException, SQLException).");
	        System.out.println("Unchecked Exception: Checked at runtime (e.g., NullPointerException, ArrayIndexOutOfBoundsException).");
	    }

	    // Method to perform division and handle division by zero exception
	    public void performDivision() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two integers:");
	        
	        try {
	            int num1 = scanner.nextInt();
	            int num2 = scanner.nextInt();
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } finally {
	            scanner.close();
	        }
	    }

	    // Method to demonstrate ArrayIndexOutOfBoundsException
	    public void demonstrateArrayIndexOutOfBoundsException() {
	        try {
	            int[] array = new int[5];
	            System.out.println(array[10]); // Accessing out of bounds
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds.");
	        }
	    }

	    // Method to demonstrate StringIndexOutOfBoundsException
	    public void demonstrateStringIndexOutOfBoundsException() {
	        try {
	            String str = "Hello";
	            System.out.println(str.charAt(10)); // Accessing out of bounds
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: String index out of bounds.");
	        }
	    }

	    // Method to simulate a login system with incorrect password handling
	    public void loginSystem() {
	        final String CORRECT_PASSWORD = "password123";
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your password:");
	        
	        try {
	            String inputPassword = scanner.nextLine();
	            if (!inputPassword.equals(CORRECT_PASSWORD)) {
	                throw new Exception("Incorrect password");
	            }
	            System.out.println("Login successful!");
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

	    // Custom exception class
	    public static class InvalidAgeException extends Exception {
	        public InvalidAgeException(String message) {
	            super(message);
	        }
	    }

	    // Method to validate age and handle InvalidAgeException
	    public void validateAge() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your age:");
	        
	        try {
	            int age = scanner.nextInt();
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be at least 18.");
	            }
	            System.out.println("Age is valid.");
	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

	    // Method to read data from a file and handle FileNotFoundException
	    public void readFile() {
	        File file = new File("example.txt");
	        
	        try {
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                System.out.println(scanner.nextLine());
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	        }
	    }

	    // Main method to test all functionalities
	    public static void main(String[] args) {
	    	Javaexceptions multiTaskClass = new Javaexceptions();
	        
	        // Explain access modifiers
	        multiTaskClass.explainAccessModifiers();
	        System.out.println();
	        
	        // Explain Exception and Error
	        multiTaskClass.explainExceptionAndError();
	        System.out.println();
	        
	        // Explain checked and unchecked exceptions
	        multiTaskClass.explainCheckedAndUncheckedExceptions();
	        System.out.println();
	        
	        // Perform division with exception handling
	        multiTaskClass.performDivision();
	        System.out.println();
	        
	        // Demonstrate ArrayIndexOutOfBoundsException
	        multiTaskClass.demonstrateArrayIndexOutOfBoundsException();
	        System.out.println();
	        
	        // Demonstrate StringIndexOutOfBoundsException
	        multiTaskClass.demonstrateStringIndexOutOfBoundsException();
	        System.out.println();
	        
	        // Simulate login system with exception handling
	        multiTaskClass.loginSystem();
	        System.out.println();
	        
	        // Validate age with custom exception
	        multiTaskClass.validateAge();
	        System.out.println();
	        
	        // Read file with exception handling
	        multiTaskClass.readFile();
	    }
	}
