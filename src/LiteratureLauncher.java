public class LiteratureLauncher {
    public static void main(String[] a) {
        WrittenBook writtenBook = new WrittenBook("WB Title", "WB author", "WB pub", "1234567891011", 15, 400);
        AudioBook audioBook = new AudioBook("AB Title", "AB author", "AB pub", "1234567891012", 15, 120);
        Magazine magazine = new Magazine("Mag Title", "Mag author", "Mag pub", "1234567891013", 4, true);

        Library myLibrary = new Library();
        myLibrary.add(writtenBook);
        myLibrary.add(audioBook);
        myLibrary.add(magazine);

        System.out.println(myLibrary.printLibrary());
    }
}
