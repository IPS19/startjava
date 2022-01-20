import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scan.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scan.nextInt();

        System.out.println("введите действие");
        Character action = scan.next().charAt(0);
        int rezult = 0;
        if(action == '*'){
            rezult = firstNumber * secondNumber;
        } else if (action == '/') {
            rezult= firstNumber / secondNumber;
        } else if (action == '+') {
            rezult = firstNumber + secondNumber;
        } else if (action == '-') {
            rezult = firstNumber - secondNumber;
        } else if (action == '%') {
            rezult = firstNumber % secondNumber;
        } else if (action == '^') {
            rezult = firstNumber;
            while (secondNumber > 1) {
                rezult *= firstNumber;
                secondNumber--;
            }
        }
        System.out.println("результат: " + rezult);
    }
}
