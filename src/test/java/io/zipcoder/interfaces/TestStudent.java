package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {
    private Student student;
    @Before
    public void setup() {
        String name = "Bobafett";
        long id = 1L;
        student = new Student(id, name);
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        // when
        double hoursStudying = 5.5;
        student.learn(hoursStudying);
        double actual = student.getTotalStudyTime();
        //then
        Assert.assertEquals(hoursStudying, actual, 0.1);
    }

}
