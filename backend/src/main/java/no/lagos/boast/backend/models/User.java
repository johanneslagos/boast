package no.lagos.boast.backend.models;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Johannes D. Lagos $today
 */

@Entity
public class User {
    @Id
    private long id;

    private String name;

    private Address address;

    private SortedSet<Bike> bikes = new TreeSet<>();

}
