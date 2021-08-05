package xyz.umbrellia.adoptions.model;

/**
 * Interface used to define behavior.
 */
public interface AnimalInterface {

    /**
     * In interfaces, fields are automatically public and static.
     */
    String hello = "Welcome from the animal kingdom!";

    public Integer age();

    /**
     * When using a default method within an interface, we can call the interface a default interface.
     * A default method is a generic implementation that does not depend on class details or functionality.
     * @return
     */
    default String description() {
        return "I am cute and fluffy!";
    }
}
