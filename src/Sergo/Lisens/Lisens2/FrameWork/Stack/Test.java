package Sergo.Lisens.Lisens2.FrameWork.Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // 5 < - 3 < - 1  out 1,3,5;

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack);
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek()); // просто посмотрели
        System.out.println(stack.pop()); // посмотрели и извлекли
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack);
    }
}
