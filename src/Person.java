// Stores the details shared by actors and directors.

import java.util.Objects;

public class Person {
    public enum Gender {
        MALE, FEMALE
    };
    private String name;
    private String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    // Returns the person's name and surname for readable output.
    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name)
                && Objects.equals(surname, person.surname)
                && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }
}
