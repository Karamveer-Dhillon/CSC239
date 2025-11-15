package chapter11;

public class chapter11 {

    public static void main(String[] args) {
        Animal animal = new Animal("fred");
        System.out.println(animal);
        Dog darwin = new Dog("Darwin", "Lab");
        System.out.println(darwin.toString());

        Animal neko = new Cat("neko","Black");

        Dog noodle = new Snake("Noodle","Viper");

        System.out.println(neko.toString());
        System.out.println(noodle.toString());

        System.out.println(noodle.getBreed());
        System.out.println(noodle.getName());
    }

}
