import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter two numbers, separated by space: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double firstMethodResult = calcResult(num1, num2);

        System.out.print("Please enter the operator (+, -, *, or /): ");
        scanner.nextLine(); // Skip line to avoid overlap from previous user input
        char oper = scanner.nextLine().charAt(0);
        double secondMethodResult = calcResult(num1, num2, oper);

        System.out.print("Please enter a formula, e.g. '3.14 * 2': ");
        double thirdMethodResult = calcResult(scanner.nextLine());

        System.out.printf("%-26s: %.2f%n", "Calling the first method", firstMethodResult);
        System.out.printf("%-26s: %.2f%n", "Calling the second method", secondMethodResult);
        System.out.printf("%-26s: %.2f%n", "Calling the third method", thirdMethodResult);
    }

    public static double calcResult(double num1, double num2) {
        return num1 + num2;
    }

    public static double calcResult(double num1, double num2, char oper) {
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
    }

    public static double calcResult(String formula) {
        int firstSpaceIndex = formula.indexOf(' ');

        double num1 = Double.parseDouble(formula.substring(0, firstSpaceIndex)); // First number is before the first space
        char oper = formula.charAt(firstSpaceIndex + 1); // Operator is after the first space
        double num2 = Double.parseDouble(formula.substring(firstSpaceIndex + 2)); // After the first space AND the operator

        return calcResult(num1, num2, oper);
    }
}
