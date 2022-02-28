package AnimalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.lang.String;


import static AnimalProject.Command.*;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String chose;

///       Command command = Command.valueOf(Command.trim().toUpperCase(Locale.ROOT).toLowerCase(Locale.ROOT));

        while (true) {

            System.out.println("Выберите команду add/list/exit");
            chose = sc.next().toUpperCase(Locale.ROOT).trim();

            switch (Command.valueOf(chose)) {
                case ADD:
                    System.out.println("Какое животное? Cat/Dog/Duck");
                    String animaltype = sc.next();
                    Animal animal = null;
                    if (animaltype.equals("Dog")) {
                        animal = new Dog();
                        generateAnimal(animal, sc);
                    } else if (animaltype.equals("Cat")) {
                        animal = new Cat();
                        generateAnimal(animal, sc);
                    } else if (animaltype.equals("Duck")) {
                        animal = new Duck();
                        generateAnimal(animal, sc);
                    }
                    animals.add(animal);
                    animal.Say();
                    break;
                case LIST:
                    for (Animal a : animals) {
                        System.out.println(a);
                    }
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong enter");


            }
        }
    }

    private static void generateAnimal(Animal animal, Scanner scanner) {
        System.out.println("Как зовут?");
        animal.setName(scanner.next());
        System.out.println("Сколько лет?");
        animal.setAge(scanner.nextInt());
        System.out.println("Какой вес?");
        animal.setWeight(scanner.nextInt());
        System.out.println("Какой цвет?");
        animal.setColor(scanner.next());
    }
}

///       Переопределите метод toString (Возврат строки: "Привет! меня зовут name, мне age лет(/год/года), я вешу - weight кг, мой цвет - color") лет или год, или года должно быть выбрано в зависимости от числа
//        var duck = new Duck();
//        var dog = new Dog();
//        var cat = new Cat();
//
//        dog.setName("Бобик");
//        dog.setAge(1);
//        dog.setColor("Черный");
//        dog.setWeight(15);
//
//        duck.Say();
//        dog.Say();
//        cat.Say();
//        System.out.println(dog);

