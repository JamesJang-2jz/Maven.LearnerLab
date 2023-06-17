package io.zipcoder.interfaces;

public class Students extends People<Student>{

    private static final Students instance = new Students();

    private Students(){
        Student student1 = new Student(1L, "Phoebe");
        Student student2 = new Student(2L, "Joey");
        Student student3 = new Student(3L, "Chandler");
        add(student1);
        add(student2);
        add(student3);
    };


    public static Students getInstance(){
        return instance;
    }

}
