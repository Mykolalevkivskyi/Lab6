// Part 1 Logic & Error Drills

// Task 1.8 The "Finally" Test

public class Task18 {
    public static void main(String[] args) {
        int number = 20;
        int divisor = 4;

        try {
            int result = number / divisor;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
