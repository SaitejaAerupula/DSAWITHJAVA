public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Print original values
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap values using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Print swapped values
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
