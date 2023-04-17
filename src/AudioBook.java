public class AudioBook extends Book implements IListenable {
    private int runtime;

    public AudioBook() {
        super();
    }

    public AudioBook(String title, String author, String publisher, String isbn, int numberOfChapters, int runtime) {
        super(title, author, publisher, isbn, numberOfChapters);
        this.runtime = runtime;
    }

    public String listen() {
        return "listening to an audiobook";
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Runtime: " + runtime + "\n";
    }
}
