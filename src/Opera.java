// Represents an opera with its choir size.
public class Opera extends MusicalShow {
    private final int choirSize;

    // Initializes the inherited show details and the number of choir members.
    public Opera(
            String title,
            int duration,
            Director director,
            String musicAuthor,
            String librettoText,
            int choirSize
    ) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
