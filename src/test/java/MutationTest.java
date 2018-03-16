import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class MutationTest {

    @Test
    public void testIsPositive() throws Exception {
        Mutation sut = new Mutation();

        assertTrue(sut.isPositive(1));
        assertTrue(sut.isPositive(0));
        assertTrue(sut.isPositive(100));

//        assertFalse(sut.isPositive(-1));
//        assertFalse(sut.isPositive(102));
//        assertFalse(sut.isPositive(101));
    }
}