package myfirst;
import java.util.Scanner;
public class tenthclass {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int num = scanner.nextInt();
	        
	        int count = 0;
	        while (num != 0) {
	            num /= 10;
	            count++;
	        }
	        
	        System.out.println("Number of digits: " + count);
	    }
	}
