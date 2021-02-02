package ru.itsjava.exsercises.excersise5;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class MapPractice2 {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);
        //из списка студентов вернуть список имен большими буквами
        // не гуммантирных факутльтетов


    }
}
//Внутри map у нас функциональный интерфейс Function