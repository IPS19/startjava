import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scan.nextInt();

        System.out.println("введите действие");
        char action = scan.next().charAt(0);

        System.out.println("Введите второе число");
        int secondNumber = scan.nextInt();
        int result = 0;
        switch (action) {
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = firstNumber;
                while (secondNumber > 1) {
                    result *= firstNumber;
                    secondNumber--;
                }
        }
        System.out.println("результат: " + (double)result);
    }
}
