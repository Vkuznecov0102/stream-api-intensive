package ru.itsjava.exsercises.excersise10;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StringPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);
        //Собрать имена всех студентов в одну строку

    }
}
