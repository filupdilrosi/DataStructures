package Lec6Stacks_end;

import java.util.Stack;

public class JSFStack {


    public static void main(String args[]) {

        Stack<String> stack = new Stack<String>();

        stack.push("Hans");
        stack.push("Meier");
        String popped = stack.pop();
        System.out.println(popped);

        stack.push("Hanna");
        stack.push("Laura");

        System.out.println(stack);


    }

}
