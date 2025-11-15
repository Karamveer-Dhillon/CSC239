/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : Book.java
 * Description : This class is a child class of Reading Material class.
 */

public class Book extends ReadingMaterial {
    // Private attributes
    private int numPages;
    private String binding;

    // Constructors
    public Book(){
        super();
        setNumPages(0);
        setBinding("hardcover");
    }
    public Book(String format,int numPages,String binding) {
        super(format);
        setNumPages(numPages);
        setBinding(binding);
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
            System.out.println("Invalid numPages. Setting to default: 1.");
            this.numPages = 1;
        }
    }

    public void setBinding(String binding) {
        if (binding.equalsIgnoreCase("hardcover") ||
                binding.equalsIgnoreCase("softcover") ||
                binding.equalsIgnoreCase("none")) {
            this.binding = binding.toLowerCase();
        } else {
            System.out.println("Invalid format. Setting to default: hardcover.");
            this.binding = "hardcover";
        }
    }
    public String getBinding () {
        return binding;
    }
    // toString
    @Override
    public String toString() {
        return super.toString()+ "Type: Book" + "\n" + "Pages: " + numPages+ "\n" + "Bindng: " + binding + "\n";
    }
}