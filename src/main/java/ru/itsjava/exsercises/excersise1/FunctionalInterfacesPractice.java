package ru.itsjava.exsercises.excersise1;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfacesPractice {


    public static void main(String[] args) {
        Runnable runnable = () ->
                System.out.println("Привет я лямбда");

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

        String example = "электричество";
        String otherExample = "3поросенка";
        Predicate<Character> isNumber = l -> Character.isDigit(l);
        System.out.println(isNumber.test(example.charAt(0)));
        System.out.println(isNumber.test(otherExample.charAt(0)));

        BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> sumBinaryOperator = (num1, num2) -> num1 + num2;
        System.out.println("sum.apply(5,4) = " + sum.apply(5, 4));
        System.out.println("sum.apply(5,4) = " + sumBinaryOperator.apply(5, 4));


        //Написать свой оператор разности для типа int
        BiFunction<Integer, Integer, Integer> subtraction = (num1, num2) -> num1 - num2;
        BinaryOperator<Integer> subBinaryOperator = (num1, num2) -> num1 - num2;

        System.out.println("subtraction.apply(36,17) = " + subtraction.apply(36, 17));
        System.out.println("subBinaryOperator.apply(75,14) = " + subBinaryOperator.apply(75, 14));

        //home
    }
}
