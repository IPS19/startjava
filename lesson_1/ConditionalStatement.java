public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println( "Старше 20 лет");
        }
        int sex = 1;
        if (sex == 1) {
            System.out.println("Мужской пол");
        }

        if (sex != 1) {
            System.out.println("Не мужской пол");
        }

        int height = 170;
        if (height < 1.80) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост выше среднего");
        }

        char firstCharOfName = 'I';
        if (firstCharOfName == 'M') {
            System.out.println("Человек на букву 'M'");
        } else if (firstCharOfName == 'I') {
            System.out.println("Человек на букву 'I'");
        } else {
            System.out.println("Неизвестное имя");
        }
    }
}