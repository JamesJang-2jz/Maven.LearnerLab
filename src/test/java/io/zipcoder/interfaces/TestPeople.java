package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    private People people;
    Person person1 = new Person(1L, "caterpie");
    @Before
    public void setup() {
        people = Students.getInstance();
        /**
        changed from new People() to Students.getInstance. Students is subtype from People
        since we changed People to abstract
         */
    }

    @Test
    public void testAdd(){
        // Given
        people.add(person1);
        // When
        // Then
        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void testRemove(){
        // Given
        people.add(person1);
        // When
        people.remove(person1);
        // Then
        Assert.assertFalse(people.contains(person1));
    }

    @Test
    public void testFindById(){
        // Given
        people.add(person1);
        // When
        Person actual = people.findById(1L);
        // Then
        Assert.assertEquals(person1, actual);
    }
}
