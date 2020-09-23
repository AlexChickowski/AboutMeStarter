/*
 * Programmer: Alex Chickowski
 * Date: September 22, 2020
 * Purpose: To print my age, name and height and then print my new age, and height
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
    	String myName = "Alex";
    	int myAge = 15;
    	double myHeightInMetres = 1.88;

        // Print the values
        System.out.println("Hi, my name is " + myName + ".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 18;
        myHeightInMetres = 1.94;

        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
    }
}
