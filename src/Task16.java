// Part 1 Logic & Error Drills

// Task 1.6	The Automatic Closer

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your name:");
            String name = scan.nextLine();
            System.out.println("Hell, " + name);
        }
    }
}
