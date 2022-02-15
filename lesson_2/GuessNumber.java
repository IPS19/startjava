import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        int generatedNumber;
        generatedNumber = random.nextInt(101) + 1;

        while (true) {
            System.out.println(player1.getName() + ", введи число");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player1.getNumber() > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player1.getNumber() == generatedNumber) {
                System.out.println(player1.getName() + " угадал!" + "\n" + "Хотите продолжить игру? [yes/no]:");
                userChoice = scanner.next();
                if (userChoice.equals("yes")) {
                    generatedNumber = random.nextInt(101) + 1;
                    continue;
                } else {
                    while (!userChoice.equals("no")) {
                        System.out.println("неверный ввод, повторите [yes/no]:");
                        userChoice = scanner.next();
                        if (userChoice.equals("yes"))
                            break;
                    }
                    break;
                }
            }

            System.out.println(player2.getName() + ", введи число");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player2.getNumber() > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player2.getNumber() == generatedNumber) {
                System.out.println(player2.getName() + " угадал!" + "\n"+ "Хотите продолжить игру? [yes/no]:");
                userChoice = scanner.next();
                if (userChoice.equals("yes")) {
                    generatedNumber = random.nextInt(101) + 1;
                    continue;
                } else {
                    while (!userChoice.equals("no")) {
                        System.out.println("неверный ввод, повторите [yes/no]:");
                        userChoice = scanner.next();
                        if (userChoice.equals("yes"))
                            break;
                    }
                    break;
                }
            }
        }
    }
}