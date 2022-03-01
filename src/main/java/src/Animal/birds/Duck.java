package src.Animal.birds;

import src.Animal.Animal;

public class Duck extends Animal implements Flying {
    @Override
    public void fly() {
        System.out.println("Я лечу!");
    }
    @Override
    public void say() {
        System.out.println("Кря!");
}
}