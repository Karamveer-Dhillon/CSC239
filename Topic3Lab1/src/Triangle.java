/**
 * Author : Karamveer Dhillon
 * Created On : 10/11/25
 * File : Triangle.java
 * Description : A class to represent a triangle with methods to calculate area 
 * and manage its dimensions.
 */
public class Triangle {
    //Attributes of the triangle
    private double base;
    private double height;
    //Constructor with default values
    public Triangle(){
        this.base = 2;
        this.height = 1;
    }
    //Constructor with parameters
    public Triangle(final double base,final double height){
        setBase(base);
        setHeight(height);
    }
    // Set and Get methods
    public void setBase(final double base){
        this.base = (base < 0)? 1 : base;
    }
    public void setHeight(final double height){
        this.height = (height < 0)? 1 : height;
    }
    public double getBase(){
        return this.base;
    }
    final public double getHeight(){
        return this.height;
    }
    public double area(){
        return (this.base * this.height) * 0.5;
    }
    //toString method to represent the triangle
    @Override
    public String toString() {
        return "["+this.base +","+ this.height + "]";
    }
}