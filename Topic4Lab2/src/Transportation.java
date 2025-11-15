/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : Transportation.java
 * Description : This is the Parent class Transportation.
 */

public class Transportation {
    // protected Attributes
    protected String make;
    protected String model;
    protected int year;
    protected int miles;
    protected int currentSpeed;

    // Constructors
    public Transportation() {
        setMake("Default");
        setModel("Default");
        setYear(2025);
        setMiles(0);
        setCurrentSpeed(0);
        System.out.println("Vehicle created");
    }

    public Transportation(String Make,String Model,int Year,int Miles) {
        setMake(Make);
        setModel(Model);
        setYear(Year);
        setMiles(Miles);
        setCurrentSpeed(0);
        System.out.println("Vehicle created");
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    // toString
    @Override
    public String toString() {
        return ("Make: " + make + "\n"+ "Model: " + model + "\n"
                + "Year: " + year + "\n" +  "Miles: " + miles + "\n"
                + "Current Speed: " + currentSpeed + "\n");
    }

    // Public Methods
    public String goForward() {
        return "Vehicle moved forward";
    }

    public String goReverse() {
        return "Vehicle moved back";
    }

    public String Stop() {
        return "Vehicle Stopped";
    }

    public String Start() {
        return "Vehicle Started";
    }

    public String turnLeft() {
        return "Vehicle turned left";
    }

    public String turnRight() {
        return "Vehicle turned right";
    }

    public void goFaster() {
        this.currentSpeed = this.currentSpeed + 5;
        System.out.println("Speed increased by 5");
    }

    public void goSlower() {

        if (this.currentSpeed - 5 >= 0) {
            this.currentSpeed -= 5;
            System.out.println("Speed decreased by 5");
        }
        else {
            this.currentSpeed = 0;
            System.out.println("Speed decreased to 0");
        }
    }
}