import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;

    private ArrayList<Actor> listOfActors = new ArrayList<>();


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printActors() {
        for (Actor actor: listOfActors ) {
            System.out.println(actor);

        }
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("This actor is already in the list");
        }
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void replaceActor(Actor newActor, String actorSurname){
        boolean actorFound = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(actorSurname)) {
                listOfActors.set(i,newActor);
                actorFound = true;
                break;
            }
        }

        if (!actorFound) {
            System.out.println("No actor with that surname was found.");

        }
    }


    @Override
    public java.lang.String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", director='" + director + '\'' +
                ", listOfActors=" + listOfActors +
                '}';
    }

}
