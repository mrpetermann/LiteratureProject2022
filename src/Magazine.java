public class Magazine extends Literature implements IReadable{
    private int issueNumber;
    private boolean hasCologneSample;

    public Magazine() {
        super();
    }

    public Magazine(String title, String author, String publisher, String isbn, int issueNumber, boolean hasCologneSample) {
        super(title, author, publisher, isbn);
        this.issueNumber = issueNumber;
        this.hasCologneSample = hasCologneSample;
    }

    @Override
    public String read() {
        return "reading a magazine";
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public boolean getHasCologneSample() {
        return hasCologneSample;
    }

    public void setHasCologneSample(boolean hasCologneSample) {
        this.hasCologneSample = hasCologneSample;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Issue: " + issueNumber + "\n" +
                "Cologne: " + hasCologneSample + "\n";
    }
}
