package xyz.umbrellia.adoptions.model;

public class Cat extends Animal {

    public Cat(String name, String photo) {
//        super(name, photo);
    }

    @Override
    public String makeSound() {
        return "Meow :3!";
    }

    @Override
    public String eat() {
        return "Whiskas.";
    }

}
