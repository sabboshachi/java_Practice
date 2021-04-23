package com.sabboshachi;

public class Main {

    public static void main(String[] args) {
	int number_1 = 10;
	int number_2 = 20;

	if (number_1 < number_2)
		System.out.println("number_1 is less than number_2");

	number_1 = number_1 * 2;

	if (number_1 == number_2)
		System.out.println("number_1 is now equal to number_2");


	number_1 = number_1 * 2;
	if (number_1 > number_2) System.out.println("Number_1 is now grater than number_2");

	//this line won't print as the program is not satisfy if condition
        if (number_1 == number_2) System.out.println("We wont see it!");
    }
}
