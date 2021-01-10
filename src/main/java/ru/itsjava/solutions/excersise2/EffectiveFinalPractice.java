package ru.itsjava.solutions.excersise2;

public class EffectiveFinalPractice {

    public static void main(String[] args) {
        String name = "Vitaliy";
        Runnable printNameRunnable = () -> System.out.println("Твое имя:" + name);
        printNameRunnable.run();


//        name = "No effective final variable ;(";
//        Runnable printNameRunnable2 = () -> System.out.println("Твое имя:" + name);
//        printNameRunnable2.run();

        // Задать переменную типа String в которой храним значение "Число положительно"
        // Написать свой предикат, который печатает переменную
        // и возвращает число >0, если число больше нуля


    }
}
//Переменные переданные в лямбды должна быть final или effective final
//Лямбды оперируют значениями!!! (а не переменными)