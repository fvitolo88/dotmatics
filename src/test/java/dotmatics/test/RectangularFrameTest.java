package dotmatics.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RectangularFrameTest {

    @Test
    public void shouldPrintRectangularFrame() {
        String[] values = {"Hello", "World", "in", "a", "frame"};
        List<String> results = new ArrayList<String>() {{
            add("*********\n");
            add("* Hello *\n");
            add("* World *\n");
            add("* in    *\n");
            add("* a     *\n");
            add("* frame *\n");
            add("*********\n");
        }};
        Assertions.assertIterableEquals(RectangularFrame.printRectangularFrame(values), results);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenArrayIsEmpty() {
        String[] values = {};
        Assertions.assertThrows(IllegalArgumentException.class, () -> RectangularFrame.printRectangularFrame(values));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenArrayIsNull() {
        String[] values = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> RectangularFrame.printRectangularFrame(values));
    }
}
