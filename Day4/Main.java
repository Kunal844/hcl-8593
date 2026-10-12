
import java.util.*;

// Functional Interface
@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lambda expressions for each operation
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add.calculate(a, b));
                break;

            case 2:
                System.out.println("Result: " + subtract.calculate(a, b));
                break;

            case 3:
                System.out.println("Result: " + multiply.calculate(a, b));
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    System.out.println("Result: " + divide.calculate(a, b));
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}