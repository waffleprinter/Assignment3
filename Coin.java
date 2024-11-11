import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heads = 0;
        int tails = 0;

        while (true) { // Play until user quits
            System.out.print("1. Toss coin\n");
            System.out.print("2. Exit\n");
            System.out.print("Choice: ");
            int userChoice = Integer.parseInt(scanner.nextLine());

            if (userChoice != 1) break; // Exit condition (break = exit loop and end game)

            if (flip()) heads++;
            else tails++;

            System.out.printf("Heads: %d, Tails: %d%n", heads, tails);
        }
    }

    public static boolean flip() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
