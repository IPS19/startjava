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
            } else do {
                System.out.println("неверный ввод, повторите [yes/no]");
                userChoice = scanner.nextLine();
                if(userChoice.equals("yes") || userChoice.equals("no"))
                    break;
            } while (true);
        }
    }
}
