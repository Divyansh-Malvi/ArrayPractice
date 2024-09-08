import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[5];
        int sum = 0;
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter an Integer value");
            userArray[i] = scanner.nextInt();
            sum = sum + userArray[i];
        }
        System.out.println("sum = " + sum);
    }
}
