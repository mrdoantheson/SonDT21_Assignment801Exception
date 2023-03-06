import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Input two real numbers: ");

        try {
            number1 = input.nextDouble();
            number2 = input.nextDouble();
            if (number2 - 0.0 == 0.0)
                throw new Exception("Can not divide by zero");
            System.out.println("The division of " + number1 + "/" + number2 + " is: " + number1 / number2);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done!");
        input.close();
    }
}