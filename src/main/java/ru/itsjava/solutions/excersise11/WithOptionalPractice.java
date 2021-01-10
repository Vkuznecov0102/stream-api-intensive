package ru.itsjava.solutions.excersise11;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;

public class WithOptionalPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students.stream().findAny().get());

    }
}
