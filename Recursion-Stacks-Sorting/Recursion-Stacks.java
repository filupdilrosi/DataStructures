package StucturesClass;
import java.util.Scanner;
import java.util.Stack;

public class Lab5StackNdRecursion {
    public static void main(String[] args) {
        //First Problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number size n:");
        int n = sc.nextInt();
        int sum = sum1ToN(n);
        System.out.println(sum);
        System.out.println("Please enter a number and how many " +
                "times you want to multiply it(separate the two numbers by a space):");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = product(a, b);
        while (product == -1){
            System.out.println("You entered a negative number please enter only positive values: ");
            a = sc.nextInt();
            b = sc.nextInt();
            product = product(a,b);
    }
        System.out.println(product);
        String test_mul1 = product(3,4) == 12 ? "pass" : "fail";
        String test_mul2 = product(4,3) == 12 ? "pass" : "fail";
        String test_mul3 = product(0,5) == 0 ? "pass" : "fail";
        String test_mul4 = product(5,0) == 0 ? "pass" : "fail";
        System.out.println("T1:"+test_mul1+" "+"T2:"+test_mul2+" "+"T3:"+test_mul3+" "+"T4:"+test_mul4);
        //Second problem
        Stack<Integer>originalStack=new Stack<Integer>();
        System.out.println("Enter a number of elements for the stack and a target value:");
        int elements = sc.nextInt();
        int target = sc.nextInt();
        for (int i = 1; i<=elements;i++) {
            originalStack.push(i);
        }
        System.out.println("Stack prior to search: " + originalStack.toString());
        boolean outcome = find(originalStack, target);//search for an element
        System.out.println("Stack after search: " + originalStack.toString());
        if(outcome)
            System.out.println("Target found in stack.");
        else
            System.out.println("Target not found in stack.");
    }
    public static int sum1ToN(int n) {
            if (n <= 1)
                return n;
            return n + sum1ToN(n - 1);
}
    public static int product(int a, int b){
        if (b == 0)
            return 0;
        if (b > 0)
            return (a + product(a, b - 1));
        return -1;
    }
    public static Boolean find(Stack<Integer> s, int num){
        Stack<Integer>temporaryStack= new Stack<>();
        boolean numExist=false;
        while(!s.empty()){
            if(s.peek()==num)//seeing if top element in stack is equal to target value
                numExist=true;
            temporaryStack.push(s.pop());//push top element to temp stack
        }
        while(!temporaryStack.empty()){
            s.push(temporaryStack.pop()); //push elements back into the original stack
        }
        return numExist;
    }
}
