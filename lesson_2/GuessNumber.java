import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public void startGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        System.out.println("Угадай число" + "\n" + "Введите имя первого игрока");
        Player player1 = new Player(scanner.next());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scanner.next());
        int generatedNumber;
        generatedNumber = random.nextInt(101) + 1;

        while (!userChoice.equals("no")) {
            System.out.println(player1.getName() + ", введи число");
            player1.setPlayerNumber(scanner.nextInt());
            if (player1.getPlayerNumber() < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player1.getPlayerNumber() > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player1.getPlayerNumber() == generatedNumber) {
                System.out.println(player1.getName() + " угадал!" + "\n" + "Хотите продолжить игру? [yes/no]:");
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
                }
            }
            System.out.println(player2.getName() + ", введи число");
            player2.setPlayerNumber(scanner.nextInt());
            if (player2.getPlayerNumber() < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player2.getPlayerNumber() > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player2.getPlayerNumber() == generatedNumber){
                System.out.println(player2.getName() + " угадал!" + "\n"+ "Хотите продолжить игру? [yes/no]:");
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
                }
            }
        }
    }
}