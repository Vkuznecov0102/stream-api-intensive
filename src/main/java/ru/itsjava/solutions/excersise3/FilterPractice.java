package ru.itsjava.solutions.excersise3;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;

public class FilterPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);

//  Найти количество всех студентов, которые учатся на гуманитарном факультете

        long countHumanitarian = 0L;
        for (Student student : students) {
            if (student.getFaculty().isHumanitarian()) {
                countHumanitarian++;
            }
        }

//         long countHumanitarian = students.stream()
//              .filter(student -> student.getFaculty().isHumanitarian())
//              .count();

//  Найти количество всех студентов,
//  которые учатся на факультете старше 1969 года

        System.out.println("countHumanitarian = " + countHumanitarian);
    }
}

//stream -- рецепт создания коллекции
