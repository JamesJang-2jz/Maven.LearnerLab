package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    private Instructor instructor;
    @Before
    public void setup() {
        String name = "Bobafett";
        long id = 1L;
        instructor = new Instructor(id, name);
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        // Given
        Student student = new Student(1L, "Jerry");
        double expected = 5.5;
        // When
        instructor.teach(student, expected);
        double actual = student.getTotalStudyTime();
        // Then
        Assert.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void testLecture(){
        // Given
        Student student1 = new Student(1L, "Jerry");
        Student student2 = new Student(2L, "Tom");
        double lectureHours = 1.2;
        Student[] students = {student1, student2};
        double expectedHours = 1.2/students.length;
        // When
        instructor.lecture(students,lectureHours);
        double actualHoursLearned = student1.getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedHours, actualHoursLearned, 0.1);
    }



}
