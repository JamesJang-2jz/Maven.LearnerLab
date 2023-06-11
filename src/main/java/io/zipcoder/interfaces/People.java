package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person p : personList) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
