import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] userArray = new float[7];
        float totalSum = 0;
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter an Integer Value");
            userArray[i] = scanner.nextFloat();
            totalSum = totalSum + userArray[i];
        }
        double average = 0;
        average = totalSum / userArray.length;
        System.out.println("Average = " + average);
    }
}
