package ru.itsjava.exsercises.excersise6;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapPractice {

    public static void main(String[] args) {
        //объединить 2 списка целых чисел
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);


    }
}
