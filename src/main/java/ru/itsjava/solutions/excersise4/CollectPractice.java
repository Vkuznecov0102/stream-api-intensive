package ru.itsjava.solutions.excersise4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectPractice {


    public static void main(String[] args) {
        List<String> list = Stream.of("One", "Two", "Three")
                .collect(Collectors.toList());
        System.out.println(list);



    }
}
