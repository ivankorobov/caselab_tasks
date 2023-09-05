public class Task2 {
    private static int a = 5;
    private static int b = 10;

    public static void main(String[] args) {
        System.out.println("Before: a = " + a + ", b = " + b);
        swap();
        System.out.println("After: a = " + a + ", b = " + b);
    }

    public static void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}