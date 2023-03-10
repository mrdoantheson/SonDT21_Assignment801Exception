import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        double num1 = 0;
        while (true) {
            System.out.print("Enter the first number: ");
            try {
                num1 = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Input the second number
        double num2 = 0;
        while (true) {
            System.out.print("Enter the second number: ");
            try {
                num2 = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Divide the numbers
        try {
            double result = Exercise1.divide(num1, num2);
            System.out.println("The result of the division is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divide(double num1, double num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("Invalid division: Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}