package xyz.umbrellia.adoptions.repository.shelter;

import xyz.umbrellia.adoptions.repository.cat.Cat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String name;

    // Eager is used to fetch Cat whenever we have a Shelter Instantiated.
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER )
    @JoinColumn(name = "cat_id")
    private Cat cat;

    @OneToMany
//            (cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch = FetchType.EAGER,
//            mappedBy = "shelter")
    @JoinColumn(name = "cat_id")
    private List<Cat> cats = new ArrayList<>();


    @ManyToMany

    public Integer getId() {
        return id;
    }

    public Shelter setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Shelter setName(String name) {
        this.name = name;
        return this;
    }
}
