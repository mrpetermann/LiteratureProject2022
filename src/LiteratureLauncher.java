public class LiteratureLauncher {
    public static void main(String[] a) {
        Library myLibrary = new Library(new Literature[] {
                new WrittenBook("WB Title", "WB author", "WB pub", "1234567891011", 15, 400),
                new AudioBook("AB Title", "AB author", "AB pub", "1234567891012", 15, 120),
                new Magazine("Mag Title", "Mag author", "Mag pub", "1234567891013", 4, true)
        });

        System.out.println(myLibrary);
    }
}
