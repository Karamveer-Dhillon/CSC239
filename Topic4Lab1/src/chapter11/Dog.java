/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author lizmiller
 */
public class Dog extends Animal {
    protected String breed;
    public Dog () {
        // super();
        System.out.println("In Dog() constructor");
    }
    public Dog (String name, String breed) {
        super (name);
        System.out.println("In Dog(String, String) constructor");
        setBreed(breed);
    }

    @Override
    public String eat() { // override Animal eat
        return ("The dog eats smelly things.");
    }

    @Override
    public String eat(String s) { // override Animal eat(S) and overload
        return ("The dog eats " + s);
    }

    @Override
    public String toString() {
        // if name is private return "Dog{" + "name=" + super.getName() + " breed=" + breed + '}';
        return "Dog{" + "name=" + name + " breed=" + breed + '}';

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
