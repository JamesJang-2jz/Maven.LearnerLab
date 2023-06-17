package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<T extends Person> implements Iterable<Person>{
    List<Person> personList;
    public People(){
        personList = new ArrayList<>();
    }

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

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.removeIf(p -> p.getId() == id);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
