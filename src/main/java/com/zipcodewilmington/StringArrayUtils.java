package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {



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



    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        // set a counter
        int counter = 0;
        // set a length variable to array length
        int len = array.length;
        // Create a string array
        String[] arrayNew = new String[len];
        // for loop to iterate through the array from top to bottom
        for(int i = 0; i < array.length; i++) {
            // set the index value of the array to the new array
            arrayNew[counter] = array[i];
            // while the index + 1 is less than the array length
            // and the new value in the array equals to the next value in the array
            while(i + 1 < array.length && arrayNew[counter].equals(array[i+1])) {
                // set the array to the same value
                arrayNew[counter] = array[i];
                // increase the index value
                i++;

            }
            // increase the counter
            counter++;
        }
        String[] finalList = new String[counter];
        finalList = Arrays.copyOfRange(arrayNew, 0, counter);

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
            int counter = 0;
            // set the length of the array to a variable
            int len = array.length;
            // set a new string to the length of the array
            String[] arrayHold = new String[len];

            // for loop through the length of the array
            for(int i = 0; i< len; i++){
                // set zList count = to the array value (making a copy)
                arrayHold[counter] = array[i];

                // while the index plus 1 is less than the length and
                // the array index equals to the next array
                while (i + 1 < len && array[i].equals(array[i + 1])) {
                    // add the array value to the list
                    arrayHold[counter] += array[i];
                    // increment the while loop by 1
                    i++;
                }
                // increment the counter by 1
                counter++;
                }

            // set the final list = to the arrays.copyOfRange(original array, integer from,integer to);
            // Arrays.copyOfRange copies the specified range of specified array into a new array
            //

            String[] finalList = Arrays.copyOfRange(arrayHold, 0, counter);





            return finalList;


        }
}