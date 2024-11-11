import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class ModuloChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number and a base, separated by space: ");
        int num = scanner.nextInt();
        int base = scanner.nextInt();

        System.out.printf("%d %s %d%n", num, isDivisible(num) ? "is divisible by" : "is not divisible by", 3);
        System.out.printf("%d %s %d%n", num, isDivisible(num, base) ? "is divisible by" : "is not divisible by", base);
        System.out.println();

        System.out.print("Please enter an English letter: ");
        scanner.nextLine();
        char letter = scanner.nextLine().charAt(0);

        System.out.print("Please enter a number base and an English letter base, separated by space: ");
        int numberBase = scanner.nextInt();
        char charBase = scanner.next().charAt(0);

        System.out.printf("'%s' %s %d%n", letter, isDivisible(letter) ? "is divisible by" : "is nt divisible by", 3);
        System.out.printf("'%s' %s %d%n", letter, isDivisible(letter, numberBase) ? "is divisible by" : "is not divisible by", numberBase);
        System.out.printf("'%s' %s '%s'%n", letter, isDivisible(letter, charBase) ? "is divisible by" : "is not divisible by", charBase);
    }

    public static int letterToNumber(char c) {
        return Character.toUpperCase(c) - 'A'; // Returns index of letter in alphabet
    }

    public static boolean isDivisible(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }

    public static boolean isDivisible(char letter) {
        return isDivisible(letterToNumber(letter));
    }

    public static boolean isDivisible(char letter, char base) {
        return isDivisible(letterToNumber(letter), letterToNumber(base));
    }
}
