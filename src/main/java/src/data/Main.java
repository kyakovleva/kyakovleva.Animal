package src.data;

import src.data.animal.Animal;
import src.data.animal.birds.Duck;
import src.data.Command;
import src.data.animal.pets.Cat;
import src.data.animal.pets.Dog;

import java.util.*;
import java.lang.String;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String chose;

        while (true) {

            System.out.println("Выберите команду add/list/exit");
            chose = sc.next().toUpperCase(Locale.ROOT).trim();

            String finalChose = chose;
            boolean isCommandExist = Arrays.stream(Command.values()).map(Command::name).collect(Collectors.toList()).contains(chose);
            if (!isCommandExist) {
                System.out.println(String.format("Команда %s не найдена", chose));
                continue;
            }
            switch (Command.valueOf(chose)) {
                case ADD:
                    System.out.println("Какое животное? Cat/Dog/Duck");

                    while (true) {

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
                        } else {
                            System.out.println(String.format("Choose correct animal"));
                            continue;
                        }
                        animals.add(animal);
                        animal.say();
                        break;
                    }
                    break;
                case LIST:
                    for (Animal a : animals) {
                        System.out.println(a);
                    }
                    break;
                case EXIT:
                    System.exit(0);
                    break;


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
//        duck.say();
//        dog.say();
//        cat.say();
//        System.out.println(dog);

