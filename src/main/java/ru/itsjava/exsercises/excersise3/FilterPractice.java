package ru.itsjava.exsercises.excersise3;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;

public class FilterPractice {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);


//  Найти количество всех студентов, которые учатся на гуманитарном факультете
        int countHumanitarianStudents = 0;
        for (Student student : students) {
            if (student.getFaculty().isHumanitarian()) {
                countHumanitarianStudents++;
            }
        }
        System.out.println(countHumanitarianStudents);


        long countStudents = students.stream()
                .filter(student -> student.getFaculty().isHumanitarian())
                .count();

        System.out.println(countStudents);

//  Найти количество всех студентов,
//  которые учатся на факультете старше 1969 года
        int countElderStudents = 0;
        for (Student student : students) {
            if (student.getFaculty().getBirthYear() > 1969) {
                countElderStudents++;
            }
        }
        System.out.println("Это не стрим " + countElderStudents);

        long count = students.stream().filter(student -> student.getFaculty().getBirthYear() > 1969).count();
        System.out.println("Это стрим " + count);

        //home
    }
}

//stream -- рецепт создания коллекции
