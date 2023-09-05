package dsa2.stack;


import java.util.ArrayList;
import java.util.List;

public class DStack {
    int index = 0;
    List<Integer> stack = new ArrayList<Integer>();

    public void push(int data) {
        stack.add(data);
        index++;

    }

    public void pop() {
        index--;
        System.out.println(stack.get(index));
        stack.remove(index);
    }

    public void show() {
        for (Integer i : stack) {
            System.out.println(i);
        }
    }


}
