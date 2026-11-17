// Part 1 Logic & Error Drills

// Task 1.9	Duck the Responsibility

public class Task19 {
    public static void main(String[] args) {
        riskyMethod();
    }

    public static void riskyMethod() throws ArithmeticException {
        int number = 20;
        int divisor = 0;
        int result = number / divisor;
        System.out.println("Result " + result);
    }
}
