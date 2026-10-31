public class Theatre {
    public static void main(String[] args) {

        // Create actors
        Actor actor1 = new Actor("Tom", "Hanks", Person.Gender.MALE, 183);
        Actor actor2 = new Actor("Meryl", "Streep", Person.Gender.FEMALE, 168);
        Actor actor3 = new Actor("Keanu", "Reeves", Person.Gender.MALE, 186);

        // Create directors
        Director director1 = new Director("Peter", "Brook", Person.Gender.MALE, 20);
        Director director2 = new Director("Ariane", "Mnouchkine", Person.Gender.FEMALE, 30);

        // Set the music author and choreographer
        String musicAuthor = "Pyotr Ilyich Tchaikovsky";
        String choreographer = "Marius Petipa";

        // Create a regular play, an opera, and a ballet
        Show regularShow = new Show(
                "Hamlet",
                180,
                director1
        );

        Opera opera = new Opera(
                "Eugene Onegin",
                180,
                director2,
                musicAuthor,
                "Libretto text for the opera...",
                30
        );

        Ballet ballet = new Ballet(
                "Swan Lake",
                150,
                director1,
                musicAuthor,
                "Libretto text for the ballet...",
                choreographer
        );

        // Add actors to the shows
        regularShow.addActor(actor1);
        opera.addActor(actor1);
        ballet.addActor(actor1);
        regularShow.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor2);

        // Print the actors in each show
        regularShow.printActors();
        opera.printActors();
        ballet.printActors();

        // Replace Tom Hanks with Meryl Streep in the opera
        opera.replaceActor(actor2, actor1);
        opera.printActors();

        // Try to replace an actor who is not in the ballet
        Actor noName = new Actor("Danila", "Kozlov", Person.Gender.MALE, 185);
        ballet.replaceActor(actor3, noName);
        ballet.printActors();

        // Print the librettos and directors
        opera.printLibretto();
        ballet.printLibretto();

        opera.printDirector();
        ballet.printDirector();
        regularShow.printDirector();

        // Try to add the same actor again
        regularShow.addActor(actor1);
    }
}
