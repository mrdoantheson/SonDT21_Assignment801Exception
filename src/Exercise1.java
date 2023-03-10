import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;

        // Input the first number
        System.out.print("Enter the first number: ");
        while (true) {
            try {
                num1 = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }

        // Input the second number
        System.out.print("Enter the second number: ");
        while (true) {
            try {
                num2 = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }

        // Divide the two numbers
        try {
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division. The second number cannot be 0.");
        }
    }
}