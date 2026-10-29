// Base class for shows that have music and a libretto.
public class MusicalShow extends Show {
    private final String musicAuthor;
    private final String librettoText;

    public MusicalShow(
            String title,
            int duration,
            Director director,
            String musicAuthor,
            String librettoText
    ) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Prints the text of the libretto.
    public void printLibretto() {
        System.out.println(librettoText);
    }
}
