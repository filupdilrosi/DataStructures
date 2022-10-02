//This removes duplicates from a SORTED ARRAY in constant time O(1)
package Lec5_end;

public class Main {

    static int removeDuplicates(int[] arr, int n)
    {
        if (n == 0 || n == 1)
            return n;

        int j = 0; // index variable

        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1]; //Add the last element anyways

        return j;
    }

    public static void main (String[] args)
    {
        int[] arr= {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
    
}
