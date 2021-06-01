package ru.itsjava.exsercises.excersise100;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {
        Student student = UniversityInitializer.initStudents().get(0);

        Optional<Student> optionalStudent = Optional.ofNullable(student);

        optionalStudent.ifPresent(student1 -> System.out.println(student.getName()));
        System.out.println(optionalStudent.get());


    }
}
