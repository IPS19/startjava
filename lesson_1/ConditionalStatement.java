public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 21;
        int sex = 1;
        int height = 170;
        char firstCharOfName = 'I';

        if (age > 20) {
            System.out.println( "Старше 20 лет");
        }
        if (sex == 1) {
            System.out.println("Мужской пол");
        }

        if (sex!=1) {
            System.out.println("Не мужской пол");
        }

        if (height < 1.80) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост выше среднего");
        }

        if (firstCharOfName == 'M') {
            System.out.println("Человек на букву 'M'");
        } else if (firstCharOfName == 'I') {
            System.out.println("Человек на букву 'I'");
        } else {
            System.out.println("Неизвестное имя");
        }
    }
}