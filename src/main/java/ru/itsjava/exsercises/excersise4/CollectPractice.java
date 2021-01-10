package ru.itsjava.exsercises.excersise4;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CollectPractice {


    public static void main(String[] args) {
        //stream превратить в список

        Stream<String> stringStream = Stream.of("One", "Two");
        List<String> stringList = stringStream.collect(toList());


    }
}
