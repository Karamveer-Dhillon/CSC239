
package chapter11;

public class Cat extends Animal {

    private String Color;

    public Cat () {
        // super();
        System.out.println("In Cat() constructor");
    }
    public Cat (String name, String Color) {
        super (name);
        System.out.println("In Cat(String, String) Color");
        setColor(Color);
    }

    @Override
    public String eat() { // override Animal eat
        return ("The Cat eats fish.");
    }

    @Override
    public String eat(String food) { // override Animal eat(S) and overload
        return ("The Cat eats " + food);
    }

    @Override
    public String toString() {

        return "Cat{" + "name: " + name + " Color: " + Color + '}';

    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

}
