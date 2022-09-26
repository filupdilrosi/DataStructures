package StucturesClass;
import java.util.Scanner;

public class ReversedArrayLabOne {
        // function swaps the array's first element with last elements
        static void reverse(int a[], int n) {
            int b, c, d;
            for (b = 0; b < n / 2; b++) {
                d = a[b];
                a[b] = a[n - b - 1];
                a[n - b - 1] = d;
            }
            // printing the reversed array
            System.out.println("Reversed array is: ");
            System.out.print("[");
            for (c = 0; c < n; c++) {
                System.out.print(a[c]);
                if (c<n-1)
                    System.out.print(",");
            }
            System.out.print("]");
        }
    public static void main(String[] args)
    {
        int i, k;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        k = scan.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<k; i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Numbers inputted: ");
        System.out.print("[");
        for (i=0; i<k; i++)
        {
            System.out.print(arr[i]);
            if (i<k-1)
                System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
        reverse(arr, arr.length);
    }
}
