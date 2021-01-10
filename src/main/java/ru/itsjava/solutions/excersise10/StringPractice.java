package ru.itsjava.solutions.excersise10;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StringPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();

        String names = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ","{","}"));

        System.out.println(names);
    }
}
