package com.zipcodewilmington;
import com.sun.xml.internal.ws.util.StringUtils;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String newString : array) {
            if (newString == value) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Collections.addAll(arrayList, array);
        Collections.reverse(arrayList);
        String[] reversedArray = arrayList.toArray(new String[0]);
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Collections.addAll(arrayList, array);
        Collections.reverse(arrayList);
        String[] reversedArray = arrayList.toArray(new String[0]);
        if (Arrays.equals(array, reversedArray)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = Arrays.toString(array);
        alphabet = alphabet.toLowerCase();
         if (alphabet.length() < 26){
             return false;
         }
         for (char letters = 'a'; letters == 'z'; letters++) {
             if (alphabet.indexOf(letters) < 0) {
                 return false;
             }

         }
         return true;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurences = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                occurences++;
            }
        }
        return occurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] arr = new String[array.length - 1];
        for(int idx = 0, newidx = 0; idx < array.length; idx++){
            if(array[idx] == valueToRemove) {
                continue;
            } else {
                arr[newidx++] = array[idx];

            }
        }
        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String lastValue = "";
        String stringArray = "";
        int count = 0;
        for (String currentVal : array) {
            if (currentVal == lastValue) {
                lastValue = currentVal;
            } else {
                stringArray += currentVal + " ";
                lastValue = currentVal;
                count += 1;
            }
        }
        String[] arr = new String[count];
        arr = stringArray.split(" ");
        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, array[0]);
        int listIndex = 0;
        for(int index = 1; index <array.length; index++) {
            if (list.get(listIndex).contains(array[index])){
                list.set(listIndex, (list.get(listIndex) + array[index]));

            } else {
                listIndex++;
                list.add(listIndex, array[index]);
            }
        }
        String[] newArr = list.toArray(new String[0]);
        return newArr;
    }


}
