import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        switch (CalculatorTest.action) {
            case '*':
                result = CalculatorTest.firstNumber * CalculatorTest.secondNumber;
                break;
            case '/':
               result = CalculatorTest.firstNumber / CalculatorTest.secondNumber;
                break;
            case '+':
                result = CalculatorTest.firstNumber + CalculatorTest.secondNumber;
                break;
            case '-':
                result = CalculatorTest.firstNumber - CalculatorTest.secondNumber;
                break;
            case '%':
                result = CalculatorTest.firstNumber % CalculatorTest.secondNumber;
                break;
            case '^':
                result = CalculatorTest.firstNumber;
                while (CalculatorTest.secondNumber > 1) {
                    result *= CalculatorTest.firstNumber;
                    CalculatorTest.secondNumber--;
                }
        }
        System.out.println("результат: " + result);
    }
}