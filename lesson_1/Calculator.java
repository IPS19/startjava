import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число");

        Scanner scannerFirstDigit = new Scanner(System.in);
        int firstDigit = scannerFirstDigit.nextInt();

        System.out.println("Введите второе число");
        Scanner scannerSecondDigit = new Scanner(System.in);
        int secondDigit = scannerSecondDigit.nextInt();

        System.out.println("введите действие");

        Scanner scannerAction = new Scanner(System.in);
        String action = scannerAction.nextLine();
        int rezult=0;
        if(action =="*"){
            rezult=firstDigit*secondDigit;
        } else if (action=="/"){
            rezult=firstDigit/secondDigit;
        } else if (action=="+"){
            rezult=firstDigit+secondDigit;
        } else if (action=="-"){
            rezult=firstDigit-secondDigit;
        } else if (action=="%"){
            rezult=firstDigit%secondDigit;
        } else if (action=="^"){
            rezult=firstDigit;
            while (secondDigit>=1){
              rezult*=firstDigit;
              secondDigit--;
            }
        }
        System.out.println("результат" + rezult);
    }
}
