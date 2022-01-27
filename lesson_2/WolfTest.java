public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setAge(5);
        wolf1.setName("Хатико");
        wolf1.setColor("серый");
        wolf1.setWeight(30);
        wolf1.setSex("мужской");

        System.out.println("Волк" + " по имени " + wolf1.getName() +
                ", весом " + wolf1.getWeight() + "кг, " + "возраст: " + wolf1.getAge() +
                " года, цвет: " + wolf1.getColor() + ", пол: "+ wolf1.getSex());

        wolf1.sit();
        wolf1.go();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}