class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Animal myAnimal1 = new Animal();
        Animal myAnimal2 = new Dog(); // Polymorphic reference
        Animal myAnimal3 = new Cat(); // Polymorphic reference

        myAnimal1.makeSound(); // Calls Animal's makeSound
        myAnimal2.makeSound(); // Calls Dog's makeSound (dynamic binding)
        myAnimal3.makeSound(); // Calls Cat's makeSound (dynamic binding)
    }
}
