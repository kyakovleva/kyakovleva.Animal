package AnimalProject;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    private String getAgeString() {
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if (ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (exclusion)
            old = "лет";
        return old;
    }

    public void Say() {
        System.out.println("Я говорю");
    }

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        return String.format("Привет! меня зовут %s, мне %s %s, я вешу - %d кг, мой цвет - %s", name, age, getAgeString(), weight, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}