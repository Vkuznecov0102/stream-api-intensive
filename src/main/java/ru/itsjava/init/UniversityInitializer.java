package ru.itsjava.init;

import ru.itsjava.model.Faculty;
import ru.itsjava.model.Student;

import java.util.ArrayList;
import java.util.List;

public class UniversityInitializer {

    public static List<Student> initStudents() {
        Faculty chemistry = new Faculty("Chemistry", 1970, false);
        Faculty programming = new Faculty("Programming", 1980, false);
        Faculty literature = new Faculty("Literature", 1950, true);
        return List.of(
                new Student("Vitaliy", 30, chemistry),
                new Student("Mark", 18, chemistry),
                new Student("Nika", 41, literature),
                new Student("Anna", 19, programming),
                new Student("Nastya", 25, chemistry),
                new Student("Nikolay", 22, literature),
                new Student("Boris", 39, programming)
        );
    }
}
