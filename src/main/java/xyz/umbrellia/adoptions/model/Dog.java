package xyz.umbrellia.adoptions.model;

public class Dog extends Animal {

    @Override
    public String makeSound() {
        return "Woof Poof Wow!";
    }

    @Override
    public String eat() {
        return "Bonesz.";
    }
}
