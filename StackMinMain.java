package StackMin;
import java.util.Stack;
public class StackMinMain {

	Stack<Integer> stack;
    int min;
   
    void pop()
    {
        if (stack.isEmpty()) {
            System.out.println("Nothing in the stack.");
            return;
        }
 
        System.out.print("The top element REMOVED: ");
        Integer j = stack.pop();
 
        if (j < min) {
            System.out.println(min);
            min = 2 * min - j;
        } else
            System.out.println(j);
    }
 
    void stackmin() { 
    	stack = new Stack<Integer>(); 
    }
 
    void push(Integer i)
    {
        if (stack.isEmpty()) {
            min = i;
            stack.push(i);
            System.out.println("The number inserted: " + i);
            return;
        }

        if (i < min) {
            stack.push(2 * i - min);
            min = i;
        } else
            stack.push(i);
 
        System.out.println("The number inserted: " + i);
    }

    
    void Min()
    {
        if (stack.isEmpty())
            System.out.println("Nothing in the stack.");
        else
            System.out.println("The min element is: " + min);
    }
}