package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    int i = 32;
        int b = 23;
        char myChar = 'D';

        // Physically wrapping my int primitive variable.
        Integer myObject = new Integer(b);

        Character myCharacter = new Character(myChar);
        char recoverchar = myCharacter.charValue();

        // Unwrapping the Integer object
        int recoverInt = myObject.intValue();

	    // The ArrayList is saving the value of integer type to an object of type Integer
	    ArrayList<Integer> myArray = new ArrayList<>();
	    myArray.add(i);

	    // With autoboxing, we don't have to use casting
	    int myItem = myArray.get(0);
    }
}
