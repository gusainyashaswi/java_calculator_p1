import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operation!");
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
