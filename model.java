package Taschenrechner;


public class model {

    private int value;


    protected model() {

        value = 0;

    }


    public int getValue() {

        return value;

    }


    public int incrementValue() {

        return value++;

    }

}