package ru.itsjava.exsercises.excersise2;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class EffectiveFinalPractice {

    public static void main(String[] args) {
        String name = "Виталий";
        name = "Виталик";

        final String name2 = name;
        Consumer<Integer> printBestPerson =
                (age) -> System.out.println(name2 + ":" + age);

        printBestPerson.accept(30);


        // Задать переменную типа String в которой храним значение "Число положительно"
        // Написать свой предикат, который пишет фразу из переменной
        // и возвращает true/false, если число >0, если число больше нуля
        final String pos = "Число положительно";
        Predicate<Long> isPositive = (l) -> l > 0;
        Consumer<String> printer = System.out::println;
        long l = 5000;
        if (isPositive.test(l)) {
            printer.accept(pos);
        } else {
            System.out.println("Попробуй еще раз");
        }


//home
    }
}
//Переменные переданные в лямбды должна быть final или effective final
//Лямбды оперируют значениями!!! (а не переменными)