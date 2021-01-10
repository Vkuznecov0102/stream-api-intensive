package ru.itsjava.solutions.excersise9;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ToCollectionPractice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 8, 5, 2, 6);
        TreeSet<Integer> treeSet = numbers.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(treeSet);

    }
}
