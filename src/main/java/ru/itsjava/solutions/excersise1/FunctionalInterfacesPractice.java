package ru.itsjava.solutions.excersise1;


import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FunctionalInterfacesPractice {


    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Привет лямбда");
        runnable.run();


        Predicate<Integer> isNegativeNumber = (num) -> num < 0;
        System.out.println("isNegativeNumber.test(-5) = " + isNegativeNumber.test(-5));
        System.out.println("isNegativeNumber.test(0) = " + isNegativeNumber.test(0));
        System.out.println("isNegativeNumber.test(10) = " + isNegativeNumber.test(10));


        //Написать свой предикат,
        //который проверяет является ли первый символ у строки числом
        //Воспользоваться Character.isDigit()


        BinaryOperator<Long> sumOperator = (x, y) -> {
            System.out.println("Сумма равна " + (x + y));
            return x + y;
        };

        sumOperator.apply(5L, 4L);

        //Написать свой оператор разности для типа int
    }
}
