public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimson = new Jaeger();
        crimson.setName("Crimson");
        crimson.setYearOfLaunch(2018);
        crimson.setGeneration("Mark-4");
        crimson.setArmor(6);
        crimson.setStrength(8);
        System.out.println(crimson.toString());
        System.out.println();

        Jaeger striker = new Jaeger();
        striker.setName("Striker");
        striker.setYearOfLaunch(2019);
        striker.setGeneration("Mark-5");
        striker.setArmor(9);
        striker.setStrength(10);
        System.out.println(striker);
        System.out.println();

        Jaeger.compareJaeger(striker,crimson);

        striker.modify();
        System.out.println(striker.toString());
        System.out.println();
        striker.fury(striker);
        System.out.println(striker.toString());
    }
}