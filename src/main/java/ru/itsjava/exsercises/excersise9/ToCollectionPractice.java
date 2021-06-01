package ru.itsjava.exsercises.excersise9;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ToCollectionPractice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 8, 5, 2, 6);
        // Превратить список в TreeSet через стримы
        var set = numbers.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
    }
}
