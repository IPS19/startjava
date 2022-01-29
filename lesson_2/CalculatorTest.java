import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            Calculator.calc();
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();

            if (userChoice.equals("yes")) {
                continue;
            } else if (userChoice.equals("no")) {
                break;
            } else while (true) {
                System.out.println("неверный ввод, повторите [yes/no]");
                scanner.nextLine();
                if (userChoice.contains("yes") || userChoice.contains("no")) {
                    break;
                }
                break;
            }
        }
    }
}
