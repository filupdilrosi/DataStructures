package javaTests;
//Note quick sort worst case is n^2 but can be nlogn, merge is always nlogn
public class MergeSort {

    public static void main(String[] args) {

        System.out.println("Let's test MergeSort");
        int[] testCase1 = new int[] { 1,4,1,1,4,5 };
        int[] testCase2 = new int[] { 6,5,4,3,2,1 };

        mergeSort(testCase1, 0, testCase1.length - 1);
        printArray(testCase1);
        mergeSort(testCase2, 0, testCase2.length - 1);
        printArray(testCase2);

    }

    // Use me to help debug - I will print a given array
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
    
    private static void mergeSort(int[] numbers, int startIndex, int endIndex) {
        // explicit base case
        if (startIndex >= endIndex) {
            return;
        }

        // sort each half
        int middleIndex = (startIndex + endIndex) / 2;
        mergeSort(numbers, startIndex, middleIndex);
        mergeSort(numbers, middleIndex+1, endIndex);

        // merge halves
        merge(numbers, startIndex, endIndex);
    }

    private static void merge(int[] numbers, int startIndex, int endIndex) {

        // find the middle
        int middle = (startIndex + endIndex) / 2;

        // create a temporary array of the correct size
        int temp [] = new int[endIndex - startIndex + 1];
        int temp_index = 0;

        // keep track of indices for both halves
        int left = startIndex;
        int right = middle + 1;

        // while both halves have data
        while((left <= middle) && (right <= endIndex)) {
            // if the left half value is less than right
            if (numbers[left] < numbers[right]) {
                // take from left
                temp[temp_index] = numbers[left];
                temp_index++;
                left++;
            } else {
                // take from right
                temp[temp_index] = numbers[right];
                temp_index++;
                right++;
            }
        }

        // add the remaining elements from the left half
        while(left <= middle) {
            temp[temp_index] = numbers[left];
            temp_index++;
            left++;
        }

        // add the remaining elements from the right half
        while(right <= endIndex) {
            temp[temp_index] = numbers[right];
            temp_index++;
            right++;
        }

        // move from temp array to the original array
        for(int i = startIndex; i <= endIndex; i++) {
            numbers[i] = temp[i - startIndex];
        }


    }
}

