import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scan.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scan.nextInt();

        System.out.println("введите действие");
        char action = scan.next().charAt(0);
        int result = 0;
        if(action == '*') {
            result = firstNumber * secondNumber;
        } else if (action == '/') {
            result = firstNumber / secondNumber;
        } else if (action == '+') {
            result = firstNumber + secondNumber;
        } else if (action == '-') {
            result = firstNumber - secondNumber;
        } else if (action == '%') {
            result = firstNumber % secondNumber;
        } else if (action == '^') {
            result = firstNumber;
            while (secondNumber > 1) {
                result *= firstNumber;
                secondNumber--;
            }
        }
        System.out.println("результат: " + result);
    }
}