import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber = random.nextInt(101) + 1;
        System.out.println("Угадай число");
        Scanner scanner = new Scanner(System.in);
        int playerAnswer;
        do {
            playerAnswer = scanner.nextInt();
            if (playerAnswer > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (playerAnswer < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        } while (generatedNumber != playerAnswer);
        System.out.println("Угадано!");
    }
}