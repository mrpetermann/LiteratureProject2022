public abstract class Literature {
    private static final int ID_MAGNITUDE = 9;

    private final int id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    public Literature() {
        this.id = getRandomId();
        this.title = "";
        this.author = "";
        this.publisher = "";
        this.isbn = "";
    }

    public Literature(String title, String author, String publisher, String isbn) {
        this.id = getRandomId();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    /**
     * Generate a random ID
     * @return Int of max length defined by magnitude constant
     */
    public static int getRandomId() {
        return (int)(Math.random()*Math.pow(10, ID_MAGNITUDE - 1));
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Concat title and author
     * @return String in format [title] by [author]
     */
    public String getTitleByAuthor() {
        return this.title + " by " + this.author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Publisher: " + publisher + "\n" +
                "ISBN: " + isbn + "\n";
    }
}
