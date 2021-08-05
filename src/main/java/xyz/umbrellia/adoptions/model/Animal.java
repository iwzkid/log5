package xyz.umbrellia.adoptions.model;

/**
 * An abstract class cannot be instantiated.
 * Abstract classes act similar to interfaces and oblige children to implement abstract methods.
 * Abstract classes do not use constructors.
 */
public abstract class Animal implements AnimalInterface {

    //    The name of the Animal.
    private String name;
    //    The picture of an animal.
    private String photo;

    /**
     * The below illustrates how to implement the 2 main constructor types. (Parameterized and Default)
     * @return
     */
//    public Animal(String name, String photo) {
//        this.name = name;
//        this.photo = photo;
//    }

//    public Animal() { }

    public String makeSound() {
        return "What does the fox say?";
    }

    /**
     * Protected function, visible only here and in child classes.
     * @return
     */
    protected String makeAdditionalSound() {
        return "Ring ding ding didididing di ding.";
    }

    /**
     * Abstract function without a body.
     * @return
     */
    public abstract String eat();

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Animal setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    @Override
    public Integer age() {
        return null;
    }
}
