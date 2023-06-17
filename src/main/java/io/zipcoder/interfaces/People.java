package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<T>{
    List<T> personList;
    public People(){
        personList = new ArrayList<>();
    }

    public void add(T person){
        personList.add(person);
    }

    public T findById(long id){
        for (T p : personList) {
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(T person){
        return personList.contains(person);
    }

    public void remove(T person){
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
    public Iterator<T> iterator() {
        return personList.iterator();
    }
}
