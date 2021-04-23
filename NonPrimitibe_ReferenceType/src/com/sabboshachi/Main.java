package com.sabboshachi;

import java.util.Date; // JAVA imports this package inside the upper package automatically with IntelliJ IDEA as we declared a date class in reference type

public class Main {

    public static void main(String[] args) {
	byte age = 30; // this is the primitive type example
	System.out.println(age);

	// Let's go for the Reference Type
        Date now = new Date();  // we date class in a package called java.util . we have date class in other package also
                                // here we have to use a "new" operator to allocate memory to this variable.
                                // for primitive type we didn't need to allocate memory specifically as it takes automatically by JRE
                                // this is one of the major differences from primitive type to reference type
                                // here the variable we declared here "now" is an instance of the class Date(). THis class defines templates or blueprints for creating new objects new instances
                                // an object is an instance of a class

        System.out.println(now);
    }
}
