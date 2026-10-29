// Represents a ballet with its choreographer.
public class Ballet extends MusicalShow {
    private final String choreographer;

    // Initializes the inherited show details and the choreographer.
    public Ballet(
            String title,
            int duration,
            Director director,
            String musicAuthor,
            String librettoText,
            String choreographer
    ) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
