// Represents a director and stores the number of shows they have directed.
public class Director extends Person {
    private final int numberOfShows;

    // Initializes the person's details and the number of shows.
    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    // Returns the number of shows directed by this person.
    public int getNumberOfShows() {
        return numberOfShows;
    }
}
