import java.util.ArrayList;

// Represents a show and manages its actors.
public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    // Prints all actors currently participating in this show.
    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    // Adds the actor only if an equal actor is not already in the list.
    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("This actor is already in the list");
        }
    }

    // Prints the director using the Director's toString() method.
    public void printDirector() {
        System.out.println(director);
    }

    // Replaces the first actor whose surname matches actorSurname.
    public void replaceActor(Actor newActor, String actorSurname) {
        boolean actorFound = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(actorSurname)) {
                listOfActors.set(i, newActor);
                actorFound = true;
                break;
            }
        }

        if (!actorFound) {
            System.out.println("No actor with that surname was found.");
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}
