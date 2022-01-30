import java.util.Scanner;

public class CalculatorTest {
    static int firstNumber;
    static int secondNumber;
    static char action;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        while (true) {
            System.out.println("Введите первое число");
            firstNumber = scanner.nextInt();

            System.out.println("введите действие");
            action = scanner.next().charAt(0);

            System.out.println("Введите второе число");
            secondNumber = scanner.nextInt();

            Calculator.calc();

            System.out.println("Хотите продолжить вычисления? [yes/no]:");

            userChoice = scanner.nextLine();

            if (userChoice.equals("yes")) {
                continue;
            } else if (userChoice.equals("no")) {
                break;
            } else
                do {
                System.out.println("неверный ввод, повторите [yes/no]");
                    userChoice = scanner.nextLine();
                if (userChoice.equals("yes") || userChoice.equals("no"))
                    break;
            } while (true);
            if(userChoice.equals("no"))
                break;
        }
    }
}