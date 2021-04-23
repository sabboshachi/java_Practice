package com.sabboshachi;

public class blockTest {
    public static void main(String[] args){
        int number_1 , number_2;

        number_2 = 20;

        // the target od this loop is a block

        for (number_1 = 0; number_1 < 10; number_1++) {
            System.out.println("This is number_1 " + number_1);
            System.out.println("This is number_2 " + number_2);
            number_2 = number_2 - 2;
        }
    }
}
