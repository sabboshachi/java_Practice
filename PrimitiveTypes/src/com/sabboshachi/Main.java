package com.sabboshachi;

public class Main {
    public static void main(String[] args){
        byte age = 30;
        System.out.println(age);
        int normalNumbers = 123_456; // use camelCasingNaming. int can hold upto 2B
        System.out.println(normalNumbers);
        long largeNumbers = 3_123_456_789L; // here it is larger than 2B so we used
        System.out.println(largeNumbers);
        float priceF = 10.5F;
        System.out.println(priceF);
        double priceD = 10.5;
        System.out.println(priceD);
        char letter = 'A';
        System.out.println(letter);
        String word= "Sabboshachi";
        System.out.println(word);
        boolean isEligibel = true;
        System.out.println(isEligibel);
        boolean eligible = false;
        System.out.println(eligible);
    }
}
