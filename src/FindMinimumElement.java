import java.util.Scanner;

public class FindMinimumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[5];
        int minimumElement = userArray[0];
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter an integer value");
            userArray[i] = scanner.nextInt();
            if (userArray[i] < minimumElement) {
                minimumElement = userArray[i];
            }
        }
        System.out.println("Minimum Element = " + minimumElement);
    }
}
