import java.util.ArrayList;

public class Library {
    private final ArrayList<Literature> library;

    public Library() {
        library = new ArrayList<>();
    }

    public void add(Literature literature) {
        library.add(literature);
    }

    /**
     * Concatenate literature information for each element in the library
     * @return String formatted as title + author of each element
     */
    public String printLibrary() {
        String toReturn  = "";

        for(Literature literature : library)
            toReturn = toReturn.concat(literature + "\n");

        return toReturn;
    }

    public ArrayList<Literature> getLibrary() {
        return library;
    }
}
