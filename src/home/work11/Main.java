/*
1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать массив из 100 обьектов типа Person заполненных случайными данными
 */
package home.work11;

import java.util.ArrayList;
import java.util.List;

import static home.work11.GenerationPerson.personGenerate;

public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listPerson.add(i, personGenerate());
            System.out.println(listPerson.get(i));
        }
    }
}
