// Part 1 Logic & Error Drills

// Task 1.5 Multi-Catch

public class Task15 {
    public static void main(String[] args) {
        int number = 20;
        int divisor = 0;
        int[] numbers = {10, 20, 30};

        try {
            int result = number / divisor;
            System.out.println("Result:" +result);
            System.out.println(numbers[3]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
    }
}
