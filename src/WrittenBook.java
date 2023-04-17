public class WrittenBook extends Book implements IReadable {
    private int pageCount;

    public WrittenBook() {
        super();
    }

    public WrittenBook(String title, String author, String publisher, String isbn, int numberOfChapters, int pageCount) {
        super(title, author, publisher, isbn, numberOfChapters);
        this.pageCount = pageCount;
    }

    public String read() {
        return "reading a book";
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return super.toString() +
             "Pages: " + pageCount + "\n";
    }
}
