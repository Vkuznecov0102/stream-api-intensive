package ru.itsjava.solutions.excersise6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractice {

    public static void main(String[] args) {
        List<Integer> together = Stream.of(List.of(1, 2), List.of(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());

    }
}
