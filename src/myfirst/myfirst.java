package myfirst;
import java.util.Scanner;

public class myfirst{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        
        System.out.print("Enter value for d: ");
        int d = scanner.nextInt();
        
        if (a + b > c + d) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }
    }
}

