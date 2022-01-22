import java.util.Random;
import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber = random.nextInt(101) + 1;
        System.out.println("Угадай число");
        Scanner scanner = new Scanner(System.in);
        int inputFromKeyboard = scanner.nextInt();
        do {
            if (inputFromKeyboard > generatedNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                scanner.nextInt();
            } else if (inputFromKeyboard < generatedNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                scanner.nextInt();
            }
        } while (generatedNumber != inputFromKeyboard);
        System.out.println("Угадано!");
    }
}