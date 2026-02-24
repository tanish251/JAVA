class EXCP extends Exception {
    public EXCP(String message) {
        super(message);
    }
}

public class CustomException{
    public static void Validate(int age) throws EXCP {
        if (age < 18) {
            throw new EXCP("Age must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
        
        System.out.println("Valid Age: " + age);
    }

    public static void main(String[] args) {
        try {
            Validate(19); // This will throw an exception
        } catch (EXCP e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

}