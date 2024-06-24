package controlsystems;
import java.util.Scanner;

public class Ques1 {

	    // Method to check if a string is a palindrome
	    public static boolean isPalindrome(String s) {
	        s = s.replaceAll("\\s", "").toLowerCase();  // Remove spaces and convert to lowercase
	        int length = s.length();
	        
	        for (int i = 0; i < length / 2; i++) {
	            if (s.charAt(i) != s.charAt(length - 1 - i)) {
	                return false;  // If characters don't match, it's not a palindrome
	            }
	        }
	        return true;  // If all characters match, it's a palindrome
	    }

	 // Task 2: Reverse a string
	    public static String reverseString(String s) {
	        String reversed = "";
	        for (int i = s.length() - 1; i >= 0; i--) {
	            reversed += s.charAt(i);
	        }
	        return reversed;
	    }

	    // Task 3: Print a number pattern
	    public static void printNumberPattern(int n) {
	        int currentNum = 1;
	        for (int i = 1; i <= n; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(currentNum + " ");
	                currentNum++;
	            }
	            System.out.println();
	        }
	    }

	    // Task 4: Print a star pattern
	    public static void printStarPattern(int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == j || i + j == n - 1 || (i == n / 2 && (j > 0 && j < n - 1)) || (j == n / 2 && (i > 0 && i < n - 1))) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    // Task 5: Anna University Grading System
	    public static String getGrade(int marks) {
	        if (marks > 100) {
	            return "Invalid Input";
	        } else if (marks >= 90) {
	            return "S";
	        } else if (marks >= 80) {
	            return "A";
	        } else if (marks >= 70) {
	            return "B";
	        } else if (marks >= 60) {
	            return "C";
	        } else if (marks >= 50) {
	            return "D";
	        } else if (marks >= 40) {
	            return "E";
	        } else {
	            return "F";
	        }
	    }

	    // Task 6: Calculate Hotel Tariff
	    public static double calculateTariff(int month, double roomRent, int daysStayed) {
	        double totalCost = roomRent * daysStayed;
	        switch (month) {
	            case 4:
	            case 5:
	            case 6:
	            case 11:
	            case 12:
	                totalCost *= 1.2;
	                break;
	            default:
	                break;
	        }
	        return totalCost;
	    }

	    // Task 7: Find the largest number among three numbers
	    public static double findLargest(double a, double b, double c) {
	        return Math.max(a, Math.max(b, c));
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Task 1: Palindrome check
	        System.out.print("Enter a string to check if it's a palindrome: ");
	        String string = scanner.nextLine();
	        if (isPalindrome(string)) {
	            System.out.println("\"" + string + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + string + "\" is not a palindrome.");
	        }

	        // Task 2: Reverse string
	        System.out.print("Enter a string to reverse: ");
	        string = scanner.nextLine();
	        System.out.println("The reversed string is: " + reverseString(string));

	        // Task 3: Number pattern
	        System.out.print("Enter the number of rows: ");
	        int n = scanner.nextInt();
	        printNumberPattern(n);

	        // Task 4: Star pattern
	        System.out.print("Enter the number of rows for the star pattern: ");
	        n = scanner.nextInt();
	        printStarPattern(n);

	        // Task 5: Grading system
	        System.out.print("Enter the marks scored by the student: ");
	        int marks = scanner.nextInt();
	        System.out.println("The grade is: " + getGrade(marks));

	        // Task 6: Hotel tariff
	        System.out.print("Enter the month number: ");
	        int month = scanner.nextInt();
	        System.out.print("Enter the room rent per day: ");
	        double roomRent = scanner.nextDouble();
	        System.out.print("Enter the number of days stayed: ");
	        int daysStayed = scanner.nextInt();
	        System.out.printf("The hotel tariff to be paid is: %.2f%n", calculateTariff(month, roomRent, daysStayed));

	        // Task 7: Largest number
	        System.out.print("Enter the first number: ");
	        double a = scanner.nextDouble();
	        System.out.print("Enter the second number: ");
	        double b = scanner.nextDouble();
	        System.out.print("Enter the third number: ");
	        double c = scanner.nextDouble();
	        System.out.println("The largest number is: " + findLargest(a, b, c));

	        scanner.close();

	    }
	}