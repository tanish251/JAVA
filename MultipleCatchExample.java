public class MultipleCatchExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // String str = null;

        try {
            // This will throw an ArithmeticException
            String str = null;
            // int result = num1 / num2; 
            // System.out.println("Result: " + result);

            // This will throw a NullPointerException
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero");
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("String is null");
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exceptions.");
    }
}