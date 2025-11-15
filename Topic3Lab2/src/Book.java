/**
 * Author : Karamveer Dhillon
 * Created On : 10/18/25
 * File : Book.java
 * Description : This is the Book Class
 */

public class Book {

    private String Author;
    private String Title;
    private int Year;
    private Chapter[] Chapters = new Chapter[10];
    // Constructors
    Book() {
        this.Author = "Random Author";
        this.Title = "Random Book";
        this.Year = 2025;
        for (int chapter = 0; chapter < Chapters.length; chapter++) {
          setChapter(new Chapter(), chapter);
      }
    }
    Book(String Author,String Title,int Year,Chapter[] chapters) {
        this.Author = Author;
        this.Title = Title;
        this.Year = Year;
        setChapter(chapters);
    }
    // Setters
    public void setAuthor(String author) {
        this.Author = author;
    }
    public void setTitle( String Title){
        this.Title = Title;
    }
    public void setYear(int Year){

        if (Year > (java.time.Year.now().getValue())){
            throw new IllegalArgumentException("Error - The year entered is invalid");
        }

        this.Year = Year;
    }
    public void setChapter(Chapter[] chapters){
        this.Chapters = chapters;
    }
    public void setChapter(Chapter chapter,int index){
        this.Chapters[index] = chapter;
    }

    // Getters
    public String getAuthor(){
        return this.Author;
    }
    public String getTitle(){
        return this.Title;
    }
    public int getYear(){
        return this.Year;
    }
    public Chapter[] getChapter(){
        return this.Chapters;
    }
    public Chapter getChapter(int chapterNum){
        return this.Chapters[chapterNum];
    }

}