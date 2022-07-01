package com.zipcodewilmington;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetLastElementTest {

    @Test
    public void testGetLastElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "dog";
        String actual = StringArrayUtils.getLastElement(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastElement2() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy"};
        String expected = "lazy";
        String actual = StringArrayUtils.getLastElement(array);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetLastElement3() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over"};
        String expected = "over";
        String actual = StringArrayUtils.getLastElement(array);
        Assertions.assertEquals(expected, actual);
    }
}
