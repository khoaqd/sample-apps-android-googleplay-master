package io.bitrise.googleplay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_twodigits_isCorrect() throws Exception {
        assertEquals(44, 22 + 22);
    }

    @Test
    public void addition_big_isCorrect() throws Exception {
        assertEquals(4444, 2222 + 2222);
    }
}