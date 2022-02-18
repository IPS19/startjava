import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        System.out.println("Угадай число");
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.next());

        while (true) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            userChoice = scanner.next();
            if (userChoice.equals("yes")) {
                continue;
            } else {
                while (!userChoice.equals("no")) {
                    System.out.println("неверный ввод, повторите [yes/no]:");
                    userChoice = scanner.next();
                    if (userChoice.equals("yes"))
                        break;
                }
                if (userChoice.equals("no"))
                    break;
            }
        }
    }
}