public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimson = new Jaeger("Crimson",2018,"Mark-4",8,6);
        System.out.println(crimson);
        System.out.println();

        Jaeger striker = new Jaeger("Striker",2019,"Mark-5", 10, 9);
        System.out.println(striker);

        striker.compareJaeger(crimson);

        striker.modify();
        System.out.println(striker);
        System.out.println();

        striker.fury(striker);
        System.out.println(striker);
    }
}