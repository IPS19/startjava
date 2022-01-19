import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println("Угадай число");
        Scanner scanner = new Scanner(System.in);
        int inputFrmKeybrd = scanner.nextInt();
        do {
            if (inputFrmKeybrd ==x) {
                System.out.println("Угадано!");
            } else if (inputFrmKeybrd > x){
                System.out.println("Данное число больше того, что загадал компьютер");
                inputFrmKeybrd = scanner.nextInt();
            } else if (inputFrmKeybrd < x){
                System.out.println("Данное число меньше того, что загадал компьютер");
                inputFrmKeybrd = scanner.nextInt();
            }
        } while (x!=inputFrmKeybrd);
    }
}