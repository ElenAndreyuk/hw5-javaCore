package org.elena;

import java.util.List;

class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public double getAverageGrade() {


        return grades.stream().mapToDouble(e -> e).average().getAsDouble();
                //   .reduce(a, b -> a + b)

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return  name + "; " + getAverageGrade() + "; " +  specialty + "\n";

    }
}
