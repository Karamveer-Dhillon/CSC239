/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : Newspaper.java
 * Description : This class is a child class of Reading Material class.
 */

public class Newspaper extends ReadingMaterial {
    // Private attribute
    private int numPages;

    // Constructors
    public Newspaper() {
        super();
        setNumPages(0);
    }

    public Newspaper(String format,int numPages) {
        super(format);
        setNumPages(numPages);
    }

    // getters and setters
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {

        if (numPages > 0) {
            this.numPages = numPages;
        }
        else {
            throw new IllegalNumPagesException(numPages);
        }
    }
    // toString
    @Override
    public String toString() {
        return super.toString()+ "Type: Newspaper" + "\n" + "Pages: " + numPages +"\n";
    }
}