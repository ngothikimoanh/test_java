package animals;

import java.lang.String;

abstract class Animal {
    public abstract void animalSound();
}

class Cats extends Animal {
    public void animalSound() {
        System.out.println("Meow meow meow meow meow meow");
    }
}

class Dogs extends Animal {
    public void animalSound() {
        System.out.println("gâu gâu gâu gâu gâu");
    }
}

public class main {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        cat.animalSound();
        dog.animalSound();
    }
}
