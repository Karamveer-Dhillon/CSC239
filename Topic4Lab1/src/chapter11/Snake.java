
package chapter11;

public class Snake extends Dog {

    public Snake () {
        // super();
        System.out.println("In Snake() constructor");
    }
    public Snake (String name, String Breed) {
        super (name,Breed);
        System.out.println("In Snake(String, String) Species");
    }

    @Override
    public String eat() { // override Animal eat
        return ("The Snake eats Rodents.");
    }

    @Override
    public String eat(String food) { // override Animal eat(S) and overload
        return ("The Snake eats " + food);
    }

    @Override
    public String toString() {

        return "Snake{" + "name: " + name + " Species: " + breed + '}';

    }

}
