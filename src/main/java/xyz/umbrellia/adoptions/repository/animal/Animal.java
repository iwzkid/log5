package xyz.umbrellia.adoptions.repository.animal;

import javax.persistence.*;

@Entity
@Inheritance
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //    The name of the Animal.
    private String name;
    //    The picture of an animal.
    private String photo;

    public Integer getId() {
        return id;
    }

    public Animal setId(Integer id) {
        this.id = id;
        return this;
    }

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
}
