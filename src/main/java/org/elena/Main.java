package org.elena;

//Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
//        Найдите первых 5 студентов специальности "Информатика"
//        с средним баллом выше 4.5, отсортированных по убыванию среднего балла.
//        В решении не использовать циклы! Только StreamAPI
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg", "IT");
        student1.setGrades(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        Student student2 = new Student("Ivan", "Информатика");
        student2.setGrades(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0));
        Student student3 = new Student("Daniil", "Информатика");
        student3.setGrades(Arrays.asList(4.0, 4.0, 3.0, 4.0, 5.0));
        Student student4 = new Student("Olga", "Информатика");
        student4.setGrades(Arrays.asList(4.0, 5.0, 5.0, 4.0, 5.0));
        Student student5 = new Student("Leonid", "Информатика");
        student5.setGrades(Arrays.asList(5.0, 2.0, 3.0, 4.0, 5.0));
        Student student6 = new Student("Maksim", "Информатика");
        student6.setGrades(Arrays.asList(2.0, 2.0, 3.0, 2.0, 5.0));
        Student student7 = new Student("Veniamin", "Информатика");
        student7.setGrades(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0));
        Student student8 = new Student("Natalia", "Информатика");
        student8.setGrades(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0));
        Student student9 = new Student("Stepan", "Информатика");
        student9.setGrades(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0));
        Student student10 = new Student("Aleksey", "Информатика");
        student10.setGrades(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0));
        Student student11 = new Student("Fedor", "Информатика");
        student11.setGrades(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0));

        List <Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
        allStudents.add(student6);
        allStudents.add(student7);
        allStudents.add(student8);
        allStudents.add(student9);
        allStudents.add(student10);
        allStudents.add(student11);

        List<Student> result = allStudents.stream()
                .filter((s) -> s.getSpecialty() == "Информатика")
                .filter(s -> s.getAverageGrade() > 4.5)
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}