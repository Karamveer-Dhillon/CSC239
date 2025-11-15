/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : Bicycle.java
 * Description : This is the Bicycle class, subclass of Transportation class
 */

public class Bicycle extends Transportation {
    // Constructors
    public Bicycle() {
        setMake("Default");
        setModel("Default");
        setYear(2025);
        setCurrentSpeed(0);
    }

    public Bicycle(String Make,String Model,int Year) {
        setMake(Make);
        setModel(Model);
        setYear(Year);
        setCurrentSpeed(0);
    }

    @Override
    public void setYear(int year) {
        this.year = Math.max(year,1810);
    }

    @Override
    public String goReverse() {
        return "";
    }

    public void goFaster() {
        this.currentSpeed =+ 1;
        System.out.println("Speed increased by 1");
    }

    public void goSlower() {
        if (this.currentSpeed > 0) {
            this.currentSpeed -= 1;
            System.out.println("Speed decreased by 1");
        }
        else {
            System.out.println("Speed already 0");
        }
    }

}