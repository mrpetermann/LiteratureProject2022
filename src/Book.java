public abstract class Book extends Literature {
    int numberOfChapters;

    public Book() {
        super();
    }

    public Book(String title, String author, String publisher, String isbn, int numberOfChapters) {
        super(title, author, publisher, isbn);
        this.numberOfChapters = numberOfChapters;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(int numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }

    /**
     * Check whether two books are the same
     * @param otherBook Book object to compare to
     * @return True if Book objects match, false if they do not
     */
    public boolean equals(Book otherBook) {
        return this.getTitleByAuthor().equals(otherBook.getTitleByAuthor())
                && this.getIsbn().equals(otherBook.getIsbn());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Chapters: " + numberOfChapters + "\n";
    }
}
