package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void test(){
        Students students = Students.getInstance();
        Student student1 = new Student(1L, "Phoebe");
        Student student2 = new Student(2L, "Joey");
        Student student3 = new Student(3L, "Chandler");
        // When

        // Then
        Assert.assertTrue(students.contains(student1));
        Assert.assertTrue(students.contains(student2));
        Assert.assertTrue(students.contains(student3));
    }

}
