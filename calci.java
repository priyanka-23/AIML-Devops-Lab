import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = reader.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = reader.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        
        double result;

        switch (operator) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }
        
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        reader.close();
    }
}

