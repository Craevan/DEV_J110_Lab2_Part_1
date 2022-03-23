package ru.avalon.jdev;

public class GraduateStudent extends Human {

    private final String thesisTitle;

    public GraduateStudent(final String firstName,
                           final String lastName,
                           final Gender gender,
                           final String faculty,
                           final String thesisTitle) {

        super(firstName, lastName, gender, faculty);
        if (thesisTitle == null)
            throw new IllegalArgumentException("Ссылка на null");
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    protected void print() {
        super.print();
        String info = " " + (getGender() == Gender.MALE ? Gender.HIS : Gender.HER) +
                " thesis title is " + getThesisTitle() + ".";

        System.out.println(info);
    }

}
