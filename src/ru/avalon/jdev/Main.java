package ru.avalon.jdev;

public class Main {
    public static void main(String[] args) {

        Human professor = new Teacher("Ronald", "Turner", Human.Gender.MALE, "Computer science", "Programming paradigms", Teacher.AcademicDegree.PhD);
        Human docent = new Teacher("Ruth", "Hollings", Human.Gender.FEMALE, "Jurisprudence", "Domestic arbitration", Teacher.AcademicDegree.CANDIDATE);

        Human bachelorLeo = new Student("Leo", "Wilkinson", Human.Gender.MALE, "Computer science", Student.Stage.BACHELOR, 3);
        Human bachelorAnna = new Student("Anna", "Cunningham", Human.Gender.FEMALE, "World economy", Student.Stage.BACHELOR, 1);

        Human masterJill = new Student("Jill", "Lundqvist", Human.Gender.FEMALE, "Jurisprudence", Student.Stage.MASTER, 1);

        Human graduateStudent = new GraduateStudent("Ronald", "Correa", Human.Gender.MALE, "Computer science", "\"Design of a functional programming language.\"");

        Human[] humans = new Human[6];
        humans[0] = professor;
        humans[1] = docent;
        humans[2] = bachelorLeo;
        humans[3] = bachelorAnna;
        humans[4] = masterJill;
        humans[5] = graduateStudent;

        Human.printAll(humans);
    }
}
