/**
 * Author : Karamveer Dhillon
 * Created On : 10/25/25
 * File : Car.java
 * Description : This is the Car class, subclass of Transportation class
 */

public class Car extends Transportation {

    public Car() {
    super ();
    }

    public Car(String Make,String Model,int Year,int Miles) {
        super (Make,Model,Year,Miles);
    }

    @Override
    public void setYear(int year) {
        this.year = Math.max(year,1910);
    }

    @Override
    public void setMiles(int Miles) {
        this.miles = Math.max(Miles,0);
    }
}