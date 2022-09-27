package StucturesClass;
import java.util.Scanner;

public class Lab6FibonacciSequenceFINISHED {
    public static int findFibonacciRecursive(int n){
        if(n == 0){
            return 0;}
        else if(n==1){
            return 1;}
        return findFibonacciRecursive(n-1)+findFibonacciRecursive(n-2);
    }
    public static int findFibonacciIterative(int n){
        int n1=0,n2=1,n3;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        n3=n2+n1;
        for(int i=2;i<n;i++)
        {
            n1=n2;
            n2=n3;
            n3=n2+n1;
        }
        return n3;
    }

    public static void main(String[] args) {
        System.out.println("Enter the nth fibonacci:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = findFibonacciRecursive(n);
        int y = findFibonacciIterative(n);
        System.out.println(x);
        System.out.println(y);
    }
}
