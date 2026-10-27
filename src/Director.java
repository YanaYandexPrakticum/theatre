public class Director extends Person {
    private int numberOfShow;

    public Director(String name, String surname, String gender, int numberOfShow) {
        super(name, surname, gender);
        this.numberOfShow = numberOfShow;
    }

    public int getNumberOfShow() {
        return numberOfShow;
    }
}
