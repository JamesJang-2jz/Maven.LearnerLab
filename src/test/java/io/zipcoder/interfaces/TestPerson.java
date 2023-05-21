package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        // given
        String name = "Bobafett";
        long id = 5L;
        // when
        Person testPerson = new Person(id, name);
        String actualName = testPerson.getName();
        // then
        Assert.assertEquals(name, actualName);
    }
    @Test
    public void testSetName(){
        // given
        String name = "Bobafett";
        long id = 5L;
        String newName = "Nemo";
        // when
        Person testPerson = new Person(id, name);
        testPerson.setName(newName);
        String actualName = testPerson.getName();
        // then
        Assert.assertEquals(newName, actualName);
    }
}
