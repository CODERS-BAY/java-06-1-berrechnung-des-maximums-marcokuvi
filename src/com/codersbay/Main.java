package com.codersbay;

import java.util.Scanner;

public class Main {

    public static int[] createArray() {
        Scanner scan = new Scanner(System.in);
        int[] arrayNumbers = new int[0];

        System.out.println("Enter your number");

        while (!scan.hasNext("q")) {
            int number = scan.nextInt();
            int[] arrayTemporary = new int[arrayNumbers.length + 1];

            for (int i = 0; i < arrayNumbers.length; i++) {
                arrayNumbers[i] = arrayTemporary[i];
            }

            arrayTemporary[arrayTemporary.length - 1] = number;
            arrayNumbers = arrayTemporary;
        }
        return arrayNumbers;
    }

    public static int calculateMaximum(int[]array) {

        int max = 0;


        for (int index = 0; index < array.length; index++) {
            if (array[index] > max)  
                max = array[index];      

        }

        System.out.println("Das Maximum dieses Arrays ist: " + max);
        return max;
    }

    public static void main (String[]args) {
        int[] array = createArray();
        calculateMaximum(array);
    }
}



