// Part 2 Complex Tasks

// Task 2.2 The Secure Array Finder

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Which index would you like to see?");
            int index = scan.nextInt();
            System.out.println("Planet: " + planets[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }
        finally {
            System.out.println("Thank you for using the Planet Finder.");
            scan.close();
        }
    }
}
