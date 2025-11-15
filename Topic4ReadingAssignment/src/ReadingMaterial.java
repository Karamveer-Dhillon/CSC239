/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : ReadingMaterial.java
 * Description : This is the parent class
 */

public class ReadingMaterial {

    // Private attribute
    private String format;

    // Constructors
    public ReadingMaterial() {
        this.format = "print";
    }

    public ReadingMaterial(String format) {
        setFormat(format);
    }

    // getters and setters
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format.equalsIgnoreCase("print") ||
                format.equalsIgnoreCase("digital") ||
                format.equalsIgnoreCase("audio")) {
            this.format = format.toLowerCase();
        } else {
            System.out.println("Invalid format. Setting to default: print.");
            this.format = "print";
        }
    }

    // toString
    @Override
    public String toString() {
        return "Reading Material format: " + format + "\n";
    }
}
