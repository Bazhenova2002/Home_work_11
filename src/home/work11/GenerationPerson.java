package home.work11;

import java.util.Random;

public class GenerationPerson {
    private static final Random RANDOM = new Random();

    public static String generatorName() {
        String[] name = {"Anna", "Misha", "Bob", "Kamil", "Milena", "Luis",
                "Olga", "Gena", "Bill"};
        return name[RANDOM.nextInt(9)];
    }

    public static String generatorSurname() {
        String[] surname = {"Shapor", "Nikitenko", "Wilson", "Taylor", "Anderson", "Cooper", "Ill"};
        return surname[RANDOM.nextInt(7)];
    }

    public static int generateAge() {
        return RANDOM.nextInt(50) + 20;
    }

    public static int generateWeight() {
        return RANDOM.nextInt(60) + 55;
    }

    public static int generateHeight() {
        return RANDOM.nextInt(5) + 80;
    }

    public static Person personGenerate() {
        int weight;
        int height;
        weight = GenerationPerson.generateWeight();
        height = weight + GenerationPerson.generateHeight();
        return new Person(GenerationPerson.generatorName(), GenerationPerson.generatorSurname(),
                GenerationPerson.generateAge(), weight, height);
    }
}

