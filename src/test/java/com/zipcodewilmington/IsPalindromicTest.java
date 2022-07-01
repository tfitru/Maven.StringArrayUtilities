package com.zipcodewilmington;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPalindromicTest {


    @Test
    public void testIsPalindromic1() {
        String[] array = {"a", "b", "c", "b", "a"};
        boolean outcome = StringArrayUtils.isPalindromic(array);
        Assertions.assertTrue(outcome);
    }



    @Test
    public void testIsPalindromic2() {
        String[] array = {"Is this a palindrome?", "This is a palindrome", "Is this a palindrome?"};
        boolean outcome = StringArrayUtils.isPalindromic(array);
        Assertions.assertTrue(outcome);
    }


    @Test
    public void testIsPalindromic3() {
        String[] array = {"Is this a plaindrome?", "This is not a plaindrome", "Is this a palindrome?", "This is not a palindrome"};
        boolean outcome = StringArrayUtils.isPalindromic(array);
        Assertions.assertFalse(outcome);
    }


}
