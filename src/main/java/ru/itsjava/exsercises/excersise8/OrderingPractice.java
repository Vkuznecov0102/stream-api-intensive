package ru.itsjava.exsercises.excersise8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class OrderingPractice {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(asList(6, 1, 4, 5, 3));

        //превратить множество чисел в список с числами в обратном порядке

        List<Integer> integerList = numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());

        System.out.println(integerList);

    }
}
