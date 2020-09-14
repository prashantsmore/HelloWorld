package com.harvard.cscie7;

/**
 * Accepts first name and prints "Hello, <first name>!"
 * @author Prashant More
 * @param firstname specifying the user's first name.
 */
public class HelloWorld {

    public static void main(String[] args) {
	    if(args.length != 1 ) {
            System.out.println("Incorrect Parameter(s). Usage java HelloWorld <firstName>");
            return;
        }
        System.out.println("Hello, " + args[0] +"!");
    }
}
