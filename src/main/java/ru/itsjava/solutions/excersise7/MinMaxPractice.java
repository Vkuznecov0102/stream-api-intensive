package ru.itsjava.solutions.excersise7;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.Comparator;
import java.util.List;

public class MinMaxPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);

        Student studentWithMinAge = students.stream()
                .min(Comparator.comparing(student -> student.getAge()))
                .get();
        System.out.println(studentWithMinAge);


    }
}