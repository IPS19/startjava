public class Calculator {
    public static int calc(int firstNumber, int secondNumber, char action) {
        switch (action) {
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                int result = firstNumber;
                for (int i = secondNumber; i > 1; i--) {
                    result *= firstNumber;
                }
                return result;
            default:
                System.out.println("неверно введено действие");
                return 0;
        }
    }
}