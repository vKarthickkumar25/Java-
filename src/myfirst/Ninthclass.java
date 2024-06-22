package myfirst;
import java.util.Scanner;
public class Ninthclass {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        
	        if (age >= 60) {
	            System.out.println("The person is a senior citizen.");
	        } else {
	            System.out.println("The person is not a senior citizen.");
	        }
	    }
	}

