package javase01.t02;

import org.junit.Test;

import static java.lang.System.out;
import static javase01.t02.MinFinder.findMin;
import static org.junit.Assert.assertEquals;

public class MinFinderTest {

    @Test
    public void testFindMin() throws Exception {

        double min = findMin(0.1);
        out.println("Минимальное значение: " + min);

        assertEquals(min, 0.06, 0.01);
    }
}
