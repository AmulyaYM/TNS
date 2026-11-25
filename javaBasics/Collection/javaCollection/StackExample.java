package Collection.javaCollection;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // push() -- adding elements
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(100);
        s.push(0);

        System.out.println(s);

        // peek() -- accessing the top element
        System.out.println(s.peek());

        // search() -- searching an element
        System.out.println(s.search(20));

        // contains() -- checking element
        System.out.println(s.contains(30));

        // pop() -- removing the top element
        s.pop();
        System.out.println("After removing: " + s);

        // isEmpty() -- checking whether stack is empty
        System.out.println(s.isEmpty());

        // Iterating elements
        for (int h : s) {
            System.out.println(h);
        }

        // clear() -- removing all elements
        s.clear();
        System.out.println(s);
    }
}
