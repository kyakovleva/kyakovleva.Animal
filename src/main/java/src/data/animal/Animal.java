package src.data.animal;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    private String getAgeString() {
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (ageLastNumber == 1)
           return "год";
        else if (ageLastNumber == 0 || ageLastNumber >= 5 || exclusion)
           return  "лет";
        else
           return "года";
    }

    public void say() {
        System.out.println("Я говорю");
    }

    protected void go() {
        System.out.println("Я иду");
    }

    protected void drink() {
        System.out.println("Я пью");
    }

    protected void eat() {
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