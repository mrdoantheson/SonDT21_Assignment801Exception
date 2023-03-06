import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Please enter number of elements of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastposition = -1;
        int[] arr = new int[n];
        System.out.println("Please enter elements for the array: ");
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                lastposition++;
                if (arr[i] == 100) {
                    throw new Exception("Value cannot be 100");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for (int i = 0; i <= lastposition; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("Done!");
        scanner.close();
    }
}
