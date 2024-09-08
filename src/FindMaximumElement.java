import java.util.Scanner;

public class FindMaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[5];
        int maximumElement = 0;
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter an integer value");
            userArray[i] = scanner.nextInt();
            if (userArray[i] > maximumElement) {
                maximumElement = userArray[i];
            }
        }
        System.out.println("Maximum Element = " + maximumElement);
    }
}
