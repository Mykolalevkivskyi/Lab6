// Part 2 Complex Tasks

// Task 2.1 The "Uncrashable" Calculator

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("First number (or exit): ");

            if (scan.hasNext("exit")) {
                scan.nextLine();
                break;
            }

            try {
                double a = scan.nextDouble();

                System.out.print("Second number: ");
                double b = scan.nextDouble();

                System.out.print("Operation (+, -, *, /):");
                String operation = scan.next();

                double result;

                if (operation.equals("+")) {
                    result = a + b;
                } else if (operation.equals("-")) {
                    result = a - b;
                } else if (operation.equals("*")) {
                    result = a * b;
                } else if (operation.equals("/")) {
                    if (b==0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result = a / b;
                } else {
                    System.out.println("Unknown operation!");
                    scan.nextLine();
                    continue;
                }

                System.out.println("Result: " + result);
                scan.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Error: please enter a number");
                scan.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: cannot divide by zero!");
                scan.nextLine();
            }
        }

        scan.close();

    }
}
