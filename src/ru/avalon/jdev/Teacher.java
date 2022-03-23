package ru.avalon.jdev;

public class Teacher extends Human {
    private String specialty;
    private final AcademicDegree academicDegree;

    public Teacher(final String firstName,
                   final String lastName,
                   final Gender gender,
                   final String faculty,
                   final String specialty,
                   final AcademicDegree academicDegree) {

        super(firstName, lastName, gender, faculty);
        setSpecialty(specialty);
        this.academicDegree = academicDegree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(final String specialty) {
        if (specialty == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.specialty = specialty;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    @Override
    public void print() {
        super.print();
        String info = " " + (getGender() == Gender.MALE ? Gender.MALE : Gender.FEMALE) +
                " has " + getAcademicDegree() + " degree in " + getSpecialty() + ".";

        System.out.println(info);
    }

    enum AcademicDegree {
        CANDIDATE("Кандидат наук"), DOCTOR("Доктор"), PhD("PhD");
        private final String degree;

        AcademicDegree(final String degree) {
            this.degree = degree;
        }

        @Override
        public String toString() {
            return degree;
        }
    }

}
