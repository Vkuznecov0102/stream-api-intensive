package ru.itsjava.exsercises.excersise1;


import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfacesPractice {


    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Привет я лямбда");
        };
        runnable.run();
        runnable.run();

        Predicate<Long> isNegative = (l) -> l < 0;

        System.out.println("isNegative.test(5L) = " + isNegative.test(5L));
        System.out.println("isNegative.test(-5L) = " + isNegative.test(-5L));
        System.out.println("isNegative.test(0L) = " + isNegative.test(0L));

        Predicate<Long> isPositive = l -> l > 0;

        //Написать свой предикат,
        //который проверяет является ли первый символ у строки числом
        //Воспользоваться Character.isDigit()

        Predicate<String> isFirstCharDigit = (str) -> {
            char firstSymbol = str.charAt(0);
            return Character.isDigit(firstSymbol);
        };

        Predicate<String> isFirstCharDigit2 = str ->
                Character.isDigit(str.charAt(0));


        BinaryOperator<Long> binarySumOperator = (x, y) -> x + y;
        System.out.println("binarySumOperator.apply(5L,4L) = " + binarySumOperator.apply(5L, 4L));

        //Написать свой оператор разности для типа int
        BinaryOperator<Integer> binaryResOperator = (x, y) -> x - y;
        System.out.println("binaryResOperator.apply(5,4) = " + binaryResOperator.apply(5, 4));
    }
}
