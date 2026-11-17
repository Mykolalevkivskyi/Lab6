// Part 1 Logic & Error Drills

// Task 1.4 The Zero Guard

public class Task14 {
    public static void main(String[] args) {
        int number = 20;
        int divisor = 0;

        if (divisor == 0) {
            System.out.println("Cannot divide!");
        } else {
            int result = number / divisor;
            System.out.println("Result: " + result);

        }
    }
}
