package Lec8BasicSorting_end;

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    System.out.println("Let's learn how to sort!");
    int[] testSelectionData = {1, 5, 2, 4, 6, 3};
    int[] testInsertionData = {1, 5, 2, 4, 6, 3};
    int[] testBubbleData = {1, 5, 2, 4, 6, 3};
    int[] testSortedData = {1, 2, 3, 4, 5, 6};
    
    selectionSort(testSelectionData);
    System.out.println("Selection Sort Result: " + Arrays.equals(testSelectionData, testSortedData));
    insertionSort(testInsertionData);
    System.out.println("Insertion Sort Result: " + Arrays.equals(testInsertionData, testSortedData));
    bubbleSort(testBubbleData);
    System.out.println("Bubble Sort Result: " + Arrays.equals(testBubbleData, testSortedData));
  }

  // Use me to help debug - I will print a given array
  public static void printArray(int[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      System.out.print(inputArray[i] + " ");
    }
    System.out.println();
  }

  public static void selectionSort(int[] inputArray) {

    int temp = 0;
    int currentMinIndex=0;

    for (int i = 0; i <= inputArray.length - 2; i++) {

      currentMinIndex = i;
      for (int j = i+1; j <= inputArray.length - 1; j++) {

        if (inputArray[currentMinIndex] > inputArray[j])
          currentMinIndex=j;

      }

      temp = inputArray[i];
      inputArray[i] = inputArray[currentMinIndex];
      inputArray[currentMinIndex] = temp;


      }

    }

  public static void insertionSort(int[] inputArray) {

    int currentElement = 0;
    int j = 0;

    for (int i = 1; i <= inputArray.length - 1; i++) {

      currentElement = inputArray[i];
      j = i;

      while ((j > 0) && (inputArray[j - 1] > currentElement)) {
        inputArray[j] = inputArray[j - 1];
        j = j - 1;
      }
      inputArray[j] = currentElement;

    }

  }

  public static void bubbleSort(int[] inputArray) {

    int temp = 0;

    for (int i = inputArray.length - 1; i>= 1; i--) {
      for (int j = 0; j <= i-1; j++) {
        if (inputArray[j] > inputArray[j + 1]) {
          temp = inputArray[j];
          inputArray[j] = inputArray[j + 1];
          inputArray[j + 1] = temp;
        }
      }
    }
  }


}
