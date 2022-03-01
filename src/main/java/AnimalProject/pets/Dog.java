package animalproject.pets;

import animalproject.Animal;

public class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("ГАВ ГАВ");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
