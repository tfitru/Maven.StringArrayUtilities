package com.zipcodewilmington;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetFirstElementTest {

    @Test
    public void testGetFirstElement1() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "the";
        String actual = StringArrayUtils.getFirstElement(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstElement2() {
        String[] array = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "quick";
        String actual = StringArrayUtils.getFirstElement(array);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testGetFirstElement3() {
        String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "brown";
        String actual = StringArrayUtils.getFirstElement(array);
        Assertions.assertEquals(expected, actual);
    }
}
