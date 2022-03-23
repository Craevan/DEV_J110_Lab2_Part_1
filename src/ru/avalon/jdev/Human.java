package ru.avalon.jdev;

public abstract class Human {

    private String firstName;
    private String lastName;
    private final Gender gender;
    private String faculty;

    public Human(final String firstName,
                 final String lastName,
                 final Gender gender,
                 final String faculty) {

        setFirstName(firstName);
        setLastName(lastName);
        this.gender = gender;
        setFaculty(faculty);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        if (firstName == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        if (lastName == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(final String faculty) {
        if (faculty == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.faculty = faculty;
    }

    protected void print() {
        String info = "This is " + getFirstName() + " " + getLastName() +
                ". " +
                (getGender() == Gender.MALE ? Gender.MALE : Gender.FEMALE) +
                " " + (this instanceof Teacher ? "teaches " : "studies ") +
                "at " + getFaculty() + ".";
        System.out.print(info);
    }

    public static void printAll(final Human[] humans) {
        if (humans == null)
            throw new IllegalArgumentException("Ссылка на null");
        for (Human homo : humans)
            homo.print();
    }

    protected enum Gender {
        MALE("He"), FEMALE("She"),
        HIS("His"), HER("Her");

        private final String gender;

        Gender(final String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return gender;
        }
    }

}

