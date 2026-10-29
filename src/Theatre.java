public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Tom", "Hanks", "male", 183);
        Actor actor2 = new Actor("Meryl", "Streep", "female", 168);
        Actor actor3 = new Actor("Keanu", "Reeves", "male", 186);

        Director director1 = new Director("Peter", "Brook", "male", 20);
        Director director2 = new Director("Ariane", "Mnouchkine", "female", 30);

        String musicAuthor = "Pyotr Ilyich Tchaikovsky";
        String choreographer = "Marius Petipa";

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

        regularShow.addActor(actor1);
        opera.addActor(actor1);
        ballet.addActor(actor1);
        regularShow.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor2);


        regularShow.printActors();
        opera.printActors();
        ballet.printActors();


        opera.replaceActor(actor2, "Hanks");
        opera.printActors();

        ballet.replaceActor(actor3, "Nobody");
        ballet.printActors();

        opera.printLibretto();
        ballet.printLibretto();

        opera.printDirector();
        ballet.printDirector();
        regularShow.printDirector();

        regularShow.addActor(actor1);

    }
}
