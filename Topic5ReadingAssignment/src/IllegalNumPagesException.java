public class IllegalNumPagesException extends IllegalArgumentException {
    private int numPages;

    public IllegalNumPagesException(int numPages) {
        super("Invalid number of pages " + numPages);
        this.numPages = numPages;
    }

    // Return the numPages
    public int getNumPages() {
        return numPages;
    }
}
