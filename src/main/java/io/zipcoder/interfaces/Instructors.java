package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    public static final Instructors instance = new Instructors();

    private Instructors(){
        Instructor instructor1 = new Instructor(1L, "Rocky");
        Instructor instructor2 = new Instructor(2L, "Diesel");
        Instructor instructor3 = new Instructor(3L, "Charizard");
        this.add(instructor1);
        this.add(instructor2);
        this.add(instructor3);
    }

    public static Instructors getInstance(){
        return instance;
    }
}
