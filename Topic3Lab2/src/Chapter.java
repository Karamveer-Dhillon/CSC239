/**
 * Author : Karamveer Dhillon
 * Created On : 10/18/25
 * File : Chapter.java
 * Description : This is the Chapter class
 */

public class Chapter {
    // Attributes
    private String Title;
    private int NumPages;

    // Constructors
    Chapter(){
        this.Title = "Random Chapter";
        this.NumPages = 0;
    }
    Chapter(String Title,int NumPages){
        setTitle(Title);
        setNumPages(NumPages);
    }
    //Setters
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public void setNumPages(int numPages) {

        if (numPages < 1) {
            throw new ArithmeticException("Error - The number of pages must be at least 1.");
        }
        this.NumPages = numPages;
    }
    //Getters
    public String getTitle(){
        return this.Title;
    }
    public int getNumPages(){
        return this.NumPages;
    }

    //to_String method
    @Override
    public String toString(){
        return ("Chapter Title: "+ Title +"\n" + "Number of Pages: " + NumPages);
    }
}