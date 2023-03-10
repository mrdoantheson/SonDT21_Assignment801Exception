import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        try {
            System.out.print("Enter first number: ");
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter second number: ");
            num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Result: " + divide(num1, num2));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    public static double divide(double num1, double num2) {
        double result = 0;
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return result;
    }
}
