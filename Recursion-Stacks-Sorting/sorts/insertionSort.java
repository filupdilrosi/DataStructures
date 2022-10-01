package javaTests;

import java.util.Random;

public class insertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) { //start w/ 2nd element

            int currentValue = inputArray[i]; //temp variable

            int j = i - 1; //walk backwards in array to compare previous element
            while (j >= 0 && inputArray[j] > currentValue) { //walk back towards beginning array
                // and only stop if at start of array or value we want to insert
                inputArray[j + 1] = inputArray[j]; //shift j to the right when target found
                j--; //to walk backwards in array
            }
            inputArray[j + 1] = currentValue; //insert
        }
        
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
