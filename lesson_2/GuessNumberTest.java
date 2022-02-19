import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerChoice = "";

        System.out.println("Угадай число");
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.next());

        while (!playerChoice.equals("no")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            do {
                playerChoice = scanner.next();
                if (!playerChoice.equals("no")) {
                    System.out.println("неверный ввод, повторите [yes/no]:");
                } else break;
            } while (!playerChoice.equals("yes"));
        }
    }
}