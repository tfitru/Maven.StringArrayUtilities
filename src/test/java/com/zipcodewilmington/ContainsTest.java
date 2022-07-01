package com.zipcodewilmington;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsTest {


    @Test
    public void testContains() {
        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        for (String s : array) {
            boolean outcome = StringArrayUtils.contains(array, s);
            Assertions.assertTrue(outcome);
        }
    }


}
