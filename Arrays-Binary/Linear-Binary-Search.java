package StucturesClass;
import java.util.Scanner;
public class Lab3LinearBinarySearch {

    public static int smallestMissing(int[] num){
        int n = num.length;

        for(int i=0;i<n;i++)
        {
            // finding element that doesn't match with the index since there are no negative numbers
            if(num[i]!=i)
            {
                n = i;
                break;
            }
        }
        // returns first found missing number
       return n;
        }
    public static int smallestMissingBs(int[] num){
        int n = num.length;

        // l/r limits for search
        int left = 0;
        int right = n-1;

        while(left<=right)
        {
            //Search for the middle and cut down which side (left or right) contains the target element
            int middle = left + (right-left)/2;
            if(num[middle]>middle)
            {
                right = middle-1;
            }
            else
            {
                left = middle+1;
            }
        }
        n = left;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an array of numbers separated by spaces: ");
        String[] intStr = sc.nextLine().split(" ");
        int[] numbers = new int[intStr.length];
        for(int i = 0;i < intStr.length;i++)
        {
//            Convert string array to ints
            numbers[i] = Integer.parseInt(intStr[i]);
        }
        System.out.println("The first missing number found from linear search is: " + smallestMissing(numbers));
        System.out.println("The first missing number found from binary search is: " + smallestMissingBs(numbers));
    }
}
