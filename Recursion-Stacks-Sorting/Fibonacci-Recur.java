package StucturesClass;
import java.util.Scanner;

public class Lab6FibonacciSequence {
    public static int findFibonacciRecursive(int n){
        if(n == 0){
            return 0;}
        else if(n==1){
            return 1;}
        return findFibonacciRecursive(n-1)+findFibonacciRecursive(n-2);
    }
    public static int findFibonacciIterative(int n){
        if(n == 0){
            return 0;}
        else if(n==1){
            return 1;}
        int sum=0;
        for (int i=n-1;i<=n;i++){
            sum +=i;
        }
        return sum;
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
