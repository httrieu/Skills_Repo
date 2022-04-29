import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class exampleTester {
    @Test
    public void subtractor1() {
        example sub = new example();
        assertEquals(3, sub.subtractor(2, 1));
    }
}
