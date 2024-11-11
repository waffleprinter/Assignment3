import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class CaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        System.out.print("""
                Please choose the case you want to convert:
                1. 'l' or 'L' for lowercase
                2. 'u' or 'U' for uppercase
                3. 't' or 'T' for titlecase
                """);
        char caseType = scanner.nextLine().charAt(0);

        System.out.printf("%-38s: %s%n", "Original word", word);
        System.out.printf("%-38s: %s%n", "Calling the first convertCase method", convertCase(word));
        System.out.printf("%-38s: %s%n", "Calling the second convertCase method", convertCase(word, caseType));
    }

    public static String toTitleCase(String str) {
        // First character is uppercase and the rest of the word is lowercase
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String convertCase(String word) {
        return toTitleCase(word);
    }

    public static String convertCase(String word, char caseType) {
        return switch (Character.toLowerCase(caseType)) { // Uppercase and lowercase version of letter return same result
            case 'l' -> word.toLowerCase();
            case 'u' -> word.toUpperCase();
            case 't' -> toTitleCase(word);
            default -> "";
        };
    }
}
