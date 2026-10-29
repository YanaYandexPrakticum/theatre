import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, String gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    // Actors are equal when their names, surnames, and heights match.
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Actor actor = (Actor) object;

        return height == actor.height
                && Objects.equals(getName(), actor.getName())
                && Objects.equals(getSurname(), actor.getSurname());

    }


    // Uses the same fields as equals().
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    // Adds the actor's height to the inherited name and surname.
    public String toString() {
            return super.toString() + " (" + height + ")";
        }
}

