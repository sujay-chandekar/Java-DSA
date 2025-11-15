import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //pushing in stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        System.out.println(stack);
        System.out.println("Peek element : "+stack.peek());
        System.out.println("Pop the element : "+stack.pop());

        System.out.println(stack);
        System.out.println("Checking is empty or not : "+stack.isEmpty());
    }
}
