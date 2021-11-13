package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackTest {

    @Test
    public void shouldPushElementInStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");

        Assertions.assertEquals(stack.pop(), "World");
        Assertions.assertEquals(stack.pop(), "Hello");
    }

    @Test
    public void shouldPopNullIfStackIsEmpty() {
        Stack<String> stack = new Stack<>();
        Assertions.assertNull(stack.pop());
    }

    @Test
    public void shouldIterateOnStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");

        Iterator<String> iterator = stack.iterator();

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(iterator.next(),"World");
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(iterator.next(),"Hello");
        Assertions.assertFalse(iterator.hasNext());
        Assertions.assertThrows(NoSuchElementException.class, iterator::next);
    }
}
