import java.util.Scanner;

public class Calculator {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        boolean control = true;
        Scanner sc = new Scanner(System.in);

        while (control) {
            System.out.println("Select an operator:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + addition(num1, num2));
                    break;
                }
                case 2: {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + subtraction(num1, num2));
                    break;
                }
                case 3: {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + multiplication(num1, num2));
                    break;
                }
                case 4: {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + division(num1, num2));
                    break;
                }
                case 5:
                    System.out.println("Exiting calculator.");
                    control = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println();
        }

        sc.close();
    }
}

