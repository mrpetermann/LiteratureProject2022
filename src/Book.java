//Book Model
public class Book {
    private static final int ID_MAGNITUDE = 9;

    private final int bookId;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    /**
     * Create a book object with 3 params
     * @param title Title of the book
     * @param author Author of the book
     * @param isbn ISBN of the book
     */
    public Book(String title, String author, String isbn) {
        this.bookId = getRandomId();
        this.title = title;
        this.author = author;
        this.publisher = "";
        this.isbn = isbn;
    }

    /**
     * Create a book object with 4 params
     * @param title Title of the book
     * @param author Author of the book
     * @param publisher Publisher of the book
     * @param isbn ISBN of the book
     */
    public Book(String title, String author, String publisher, String isbn) {
        this.bookId = getRandomId();
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    /**
     * Generate a random book ID
     * @return Int of max length defined by magnitude constant
     */
    public static int getRandomId() {
        return (int)(Math.random()*Math.pow(10, ID_MAGNITUDE - 1));
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Concat title and author of a Book
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

    /**
     * Check whether two books are the same
     * @param otherBook Book object to compare to
     * @return True if Book objects match, false if they do not
     */
    public boolean equals(Book otherBook) {
        return this.getTitleByAuthor().equals(otherBook.getTitleByAuthor())
                && this.isbn.equals(otherBook.isbn);
    }
}
