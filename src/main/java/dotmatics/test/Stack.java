package dotmatics.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<Item> implements Iterable<Item>{

    // finish this class implementation using a resizable array
    private final LinkedList<Item> stack = new LinkedList<>();

    public boolean isEmpty() {
        return !iterator().hasNext();
    }
    // Add an Item to the stack
    public void push(Item item) {
        stack.push(item);
    }

    // Remove item from stack and return it
    public Item pop() {
        return !isEmpty() ? stack.pop() : null;
    }

    @Override
    public Iterator<Item> iterator() {
        return stack.iterator();
    }

}
