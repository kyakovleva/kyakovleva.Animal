package AnimalProject;

public class Dog extends Animal {
    @Override
    public void Say() {
        System.out.println("ГАВ ГАВ");
    }

    @Override
    public String toString() {
        return super.toString() + ". Я Пес";
    }
}
