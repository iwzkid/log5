package xyz.umbrellia.adoptions.repository.cat;

import xyz.umbrellia.adoptions.repository.animal.*;
import xyz.umbrellia.adoptions.repository.shelter.Shelter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cat extends Animal {

    // Bidirectional relation.
    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;

}
