public class IntegerArrayInitialization {
    public static void main(String[] args) {
        int[] userArray = {10, 20, 30, 40, 50};
        System.out.print("[ ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i]);
            if (i != userArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }

}
