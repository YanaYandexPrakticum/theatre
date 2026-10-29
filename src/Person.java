// Stores the details shared by actors and directors.
public class Person {
    private String name;
    private String surname;
    private String gender;

    public Person(String name, String surname, String gender) {
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

    public String getGender() {
        return gender;
    }

    // Returns the person's name and surname for readable output.
    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
