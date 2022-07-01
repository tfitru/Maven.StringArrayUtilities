package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {

//    public static void main(String[] args) {
//        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
//        String valueToRemove = "The";
//
//
//
//    }
//
//        System.out.println(fitArray.toString());
//
//}


    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String index = "";

        index = (String) Array.get(array, array.length - 1);


        return index;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String index = "";
        index = (String) Array.get(array, array.length - 2);
        return index;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List<String> containsList = new ArrayList<>(Arrays.asList(array));
        return containsList.contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        // create array to hold onto the length of the array input
        // go through the reverseA and push the values of array input to it and return the new array
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String[] rArray = new String[list.size()];
        rArray = list.toArray(array);

        return rArray;


    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(array[array.length - i - 1])) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(array[array.length - i - 1])) return true;
        }

        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        // get the index position of the valueToRemove
        // move it to anotherArray
        // return the new array without the valueToRemove
        List<String> fitArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            fitArray.add(array[i]);

            if (fitArray.contains(valueToRemove)) {
                fitArray.remove(valueToRemove);
            }
        }

        String[] x = fitArray.toArray(new String[0]);


        return x;

// reverse in place code
//       int x = 0;
//       String[] anotherArray = new String[array.length];
//       for(int i = 0; i<array.length; i++) {
//           System.out.println(array[i].equals(valueToRemove));
//           if(array[i].equals(valueToRemove)){
//               x += array[i].indexOf(valueToRemove);
//               System.out.println(x);
//           }
//       }

//       System.out.println(x);
//
//
//
//
//       return anotherArray;


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {


        int co = 0;
        int len = array.length;
        String[] zList = new String[len];
        for(int i = 0; i < array.length; i++) {
            zList[co] = array[i];
            while(i + 1 < array.length && zList[co].equals(array[i+1])) {
                zList[co] = array[i];
                i++;

            }
            co++;
        }
        String[] finalList = new String[co];
        finalList = Arrays.copyOfRange(zList, 0, co);

        return finalList;

// Longer code
        //     Set a string as a holder
        // if the array does not equal to the next array index position
        // add the array item with space into the array
        // provide the array with the last element
        // set the string back to together in an array and remove the empty space

//        String array1="";
//
//        for(int i = 0; i< array.length - 1; i++) {
//            if(!array[i].equals(array[i+1])){
//                array1 += (array[i] + " ");
//            }
//        }
//
//        array1 += (array[array.length -1]);
//        String[] array2 = array1.split("");
//
//        return array2;


    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO

    //
        public static String[] packConsecutiveDuplicates (String[]array){
            // create an integer as a counter
            int co = 0;
            // set the length of the array to a variable
            int len = array.length;
            // set a new string to the length of the array
            String[] zList = new String[len];

            // for loop through the length of the array
            for(int i = 0; i< len; i++){
                // set zList count = to the array value (making a copy)
                zList[co] = array[i];

                // while the index plus 1 is less than the length and
                // the array index equals to the next array
                while (i + 1 < len && array[i].equals(array[i + 1])) {
                    // add the array value to the list
                    zList[co] += array[i];
                    // increment the while loop by 1
                    i++;
                }
                // increment the counter by 1
                co++;
                }

            // set the final list = to the arrays.copyOfRange(original array, integer from,integer to);
            //

            String[] finalList = Arrays.copyOfRange(zList, 0, co);





            return finalList;


        }
}