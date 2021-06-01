package ru.itsjava.exsercises.excersise5;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapPractice2 {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        //System.out.println(students);
        //из списка студентов вернуть список имен большими буквами
        // не гуммантирных факутльтетов

        var stream = students.stream().filter(student -> (!student.getFaculty().isHumanitarian())).
                map(student -> student.getName().toUpperCase(Locale.ROOT)).
                collect(Collectors.toSet());
        System.out.println(stream);


    }
}
//Внутри map у нас функциональный интерфейс Function