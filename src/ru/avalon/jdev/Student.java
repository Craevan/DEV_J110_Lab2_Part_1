package ru.avalon.jdev;

public class Student extends Human {

    private final Stage stage;
    private int courseNumber;

    public Student(final String firstName,
                   final String lastName,
                   final Gender gender,
                   final String faculty,
                   final Stage stage,
                   final int courseNumber) {

        super(firstName, lastName, gender, faculty);
        this.stage = stage;
        setCourseNumber(courseNumber);
    }

    public Stage getStage() {
        return stage;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(final int courseNumber) {
        if (courseNumber <= 0 || courseNumber > 6)
            throw new IllegalArgumentException();
        this.courseNumber = courseNumber;
    }

    @Override
    protected void print() {
        super.print();
        String info = " " + (getGender() == Gender.MALE ? Gender.MALE : Gender.FEMALE) +
                " is " + getCourseNumber() + "`th year " + getStage() + " student.";

        System.out.println(info);
    }

    enum Stage {
        BACHELOR("Бакалавр"),
        MASTER("Магистр");

        private final String stage;

        Stage(final String stage) {
            this.stage = stage;
        }

        @Override
        public String toString() {
            return stage;
        }
    }

}
