public class Calculator {
    public static String calc(int firstNumber, int secondNumber, char action) {
        switch (action) {
            case '*':
                return Integer.toString(firstNumber * secondNumber);
            case '/':
                return Integer.toString(firstNumber / secondNumber);
            case '+':
                return Integer.toString(firstNumber + secondNumber);
            case '-':
                return Integer.toString(firstNumber - secondNumber);
            case '%':
                return Integer.toString(firstNumber % secondNumber);
            case '^':
                int result = firstNumber;
                for (int i = secondNumber; i > 1; i--) {
                    result *= firstNumber;
                }
                return Integer.toString(result);
            default:
                return "неверно введено действие";
        }
    }
}