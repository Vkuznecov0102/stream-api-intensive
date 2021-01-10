package ru.itsjava.solutions.excersise8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class OrderingPractice {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(asList(6, 1, 4, 5, 3));

//        numbers.forEach(elem -> System.out.println(elem));

        List<Integer> orderNumbers = numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());

        orderNumbers.forEach(System.out::print);


    }
}
