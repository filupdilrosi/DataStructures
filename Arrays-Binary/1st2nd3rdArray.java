package StucturesClass;
import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //read input in str[] array of any size
    String[] str = sc.nextLine().split(" ");
    int n = str.length;
    //Convert str array to int
    int[] array = new int[n];

    //fill integer array
    for(int i=0; i<n; i++){
        array[i] = Integer.parseInt(str[i]);
    }

    //initialize first as arr[0] and second and third as Integer.MIN_VALUE
    int first = array[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
    for(int i=0; i< n; i++)
    {
        if(array[i] > first)
        {
            third = second;
            second = first;
            first = array[i];
        }
        // If array[i] is in between 1st and 2nd
        else if (array[i] > second && array[i] != first)
        {
            second = array[i];
        }
        // if array[i] is in between 2 and 3
        else if (array[i]>third && array[i]!=second && array[i]!=first)
        {
            third = array[i];
        }
    }
    System.out.println("The first largest element" + " is " + first);
    System.out.println("The second largest element" + " is " + second);
    System.out.println("The third largest element" + " is " + third);
}}
