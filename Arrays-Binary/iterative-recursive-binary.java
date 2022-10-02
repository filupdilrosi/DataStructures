package javaTests;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class insertionSort {

    int binarySearchRecursive(ArrayList<Integer> arr, int l, int r, int x)
    {
        if (r >= l && l<=arr.size()-1) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x)
                return mid;
            if (arr.get(mid) > x)
                return binarySearchRecursive(arr, l,mid - 1, x);
            return binarySearchRecursive(arr, mid + 1, r, x);
        }
        return -1;
    }
    int binarySearchIterative(ArrayList<Integer> nums, int target){
        int lo = 0, hi = nums.size() - 1;
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (nums.get(mid) < target) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (nums.get(lo) == target) {
            return lo;
        }
        else if (nums.get(hi) == target) {
            return hi;
        }
        else {
            return -1;
        }
    }

    // Driver method to test above
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        insertionSort ob = new insertionSort();
        System.out.println("Enter a target(0-100): ");
        int target = sc.nextInt();
        for (int i = 0; i < 101; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        int n = numbers.size();
        int result = ob.binarySearchRecursive(numbers, 0, n - 1, target);
        int iterativeRes = ob.binarySearchIterative(numbers,target);
        if (result == -1 || iterativeRes==-1)
            System.out.println("Element not present");
        else
            System.out.println("\nElement found at index "
                    + result +" "+ iterativeRes);
    }
}
