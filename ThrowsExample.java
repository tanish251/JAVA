public class ThrowsExample {
        public static void fun(String[] args) throws Exception{
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        }
        public static void main(String[] args) {
            try {
                fun(args);
            } catch (Exception e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }
