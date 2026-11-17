// Part 2 Complex Tasks

// Task 2.3 The Data Parser (Checked vs. Unchecked)

public class Task23 {

    public static int parseID(String input) {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        String[] ids = {"123", "456", "abc", "789"};

        for (int i = 0; i < ids.length; i++) {
            try {
                int number = parseID(ids[i]);
                System.out.println("Parse ID: " + number);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid ID: " + ids[i]);
            }
        }
    }
}
