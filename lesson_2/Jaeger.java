public class Jaeger {
    private String name;
    private int yearOfLaunch;
    private String generation;
    private int strength;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void modify() {
        setGeneration(getGeneration() + "S");
    }

    public void fury(Jaeger a) {
        a.setStrength(a.getStrength() + 3);
        a.setArmor(a.getArmor() - 2);
    }

    public static void compareJaeger(Jaeger a, Jaeger b) {
        if (a.getStrength() > b.getStrength()) {
            System.out.println("у егеря " + a.getName() +
                    " сила атаки больше, чем у егеря " + b.getName() +" на " + 
                    (a.getStrength() - b.getStrength()));
        } else if (a.getStrength() < b.getStrength()) {
            System.out.println("у егеря " + b.getName() +"сила атаки больше, чем у егеря "
             + a.getName() + " на " + (b.getStrength() - a.getStrength()));
        }
        System.out.println();
        if (a.getArmor() > b.getArmor()) {
            System.out.println("у егеря " + a.getName() + " защита лучше, чем у егеря " +
                b.getName() + " на " + (a.getArmor() - b.getArmor()));
        } else if (a.getArmor() < b.getArmor()) {
            System.out.println("у егеря " + b.getName() + " защита лучше, чем у егеря" + 
                a.getArmor());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Егерь " +'\n'+
                "имя: " + name + '\n' +
                "год выпуска: " + yearOfLaunch + '\n' +
                "модель: " + generation + '\n' +
                "сила атаки: " + strength +
                " защита: " + armor;
    }
}