public class Wolf {
    private String sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age>8 || age<0) {
            System.out.println("Некорректрный возраст");
        } else
            this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void go() {
        System.out.println(name + " идёт");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void howl() {
        System.out.println(name + " воет");
    }

    public void hunt() {
        System.out.println(name + " охотится");
    }
}