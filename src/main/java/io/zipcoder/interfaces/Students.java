package io.zipcoder.interfaces;

public class Students extends People{

    private static final Students instance = new Students();

    private Students(){};

    public static Students getInstance(){
        return instance;
    }

}
