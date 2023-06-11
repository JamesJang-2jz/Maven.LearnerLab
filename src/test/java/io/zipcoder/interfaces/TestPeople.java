package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    private People people;
    Person person1 = new Person(1L, "caterpie");
    @Before
    public void setup() {
        people = new People();
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

}
