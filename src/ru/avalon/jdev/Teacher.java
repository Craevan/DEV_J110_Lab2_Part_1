package ru.avalon.jdev;

public class Teacher extends Human {
    private String specialty;
    private AcademicDegree academicDegree;

    public Teacher(String firstName, String lastName, Gender gender, String faculty, String specialty, AcademicDegree academicDegree) {
        super(firstName, lastName, gender, faculty);
        setSpecialty(specialty);
        this.academicDegree = academicDegree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    @Override
    public void print() {
        String info = "This is " + getFirstName() + " " + getLastName() +
                ". " +
                (getGender() == Gender.MALE ? Gender.MALE : Gender.FEMALE) +
                " " + "teaches " + "at " + getFaculty() + ". " +
                (getGender() == Gender.MALE ? Gender.MALE : Gender.FEMALE) +
                " has " +
                getAcademicDegree() + " degree in " + getSpecialty() + ".";

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
