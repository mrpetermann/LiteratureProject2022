import java.util.ArrayList;

public class Library {
    private final ArrayList<Literature> library;

    public Library() {
        library = new ArrayList<>();
    }

    public Library(Literature[] arr) {
        this();
        for(Literature lit : arr)
            library.add(lit);
    }

    public void add(Literature literature) {
        library.add(literature);
    }

    /**
     * Concatenate literature information for each element in the library
     * @return String formatted as title + author of each element
     */
    @Override
    public String toString() {
        String toReturn  = "";

        for(Literature literature : library)
            toReturn = toReturn.concat(literature + "\n");

        return toReturn;
    }

    public ArrayList<Literature> getLibrary() {
        return library;
    }
}
