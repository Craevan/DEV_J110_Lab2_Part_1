package ru.avalon.jdev;

public abstract class Human {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String faculty;

    public Human(final String firstName, final String lastName, final Gender gender, final String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    protected abstract void print();

    public void printAll(Human[] humans) {
        for (Human homo : humans)
            homo.print();
    }

    protected enum Gender {
        MALE("He"), FEMALE("She");

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

