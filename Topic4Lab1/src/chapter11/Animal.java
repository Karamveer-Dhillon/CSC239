
package chapter11;

public class Animal extends Object {
    protected String name; // available to all subclasses

    public Animal() { // overloaded constructor #1
        System.out.println("In Animal() constructor");
    }
    public Animal(String name) { // overloaded constructor #2
        System.out.println("In Animal(String) constructor");
        setName(name);
    }
    public String eat() { // overloaded eat method
        return ("The animal eats");
    }
    public String eat(String s) { // overloaded eat method
        return ("The animal eats " + s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }

}
