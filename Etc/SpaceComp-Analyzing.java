package StucturesClass;
import java.util.Arrays;
import java.util.Scanner;
public class Lab4SpaceComplexity {

    private static int[] reverseArray(int[] arr)
    {
        int[] result = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            result[arr.length-1-i]=arr[i];
        }
        return result;
    }

    private static int[] reverseArray2(int[] arr)
    {
        int[] res = new int[arr.length];
        for (int i=0; i< arr.length; i++){
            res[arr.length-1-i]=arr[i];
        }
        int[][] TwoDisArray = new int[arr.length][arr.length/2];
        //do something w/ 2 dimesional array
        return res;
    }

    private static boolean hasDuplicates(int[] arr)
    {
        for (int i=0; i< arr.length-1;i++){
            for (int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an array of numbers separated by spaces: ");
        String[] intStr = sc.nextLine().split(" ");
        int[] numbers = new int[intStr.length];
        for(int i = 0;i < intStr.length;i++)
        {
//            Convert string array to ints
            numbers[i] = Integer.parseInt(intStr[i]);
        }
        System.out.println("Reversed array is: " + Arrays.toString(reverseArray(numbers)));
        System.out.println("Duplicates: " + hasDuplicates(numbers));
    }
}
