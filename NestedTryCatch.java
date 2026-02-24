public class NestedTryCatch{
    public static void main(String[] args) {
        try {
            //Oyter Try Block
            System.out.println("Outer Try Block");
            try {
                //Inner Try Block
                System.out.println("Inner Try Block");
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException in the inner try block: " + e.getMessage());
            }
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException in the outer try block: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues after Nested Try-Catch.");
    }
}