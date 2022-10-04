package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
    public static boolean intArraySorted(int[] arr) {
        int i = arr[0];
        for (int x: arr) {
        	if (x < i) {
        		return false;
        	} else {
        		i = x;
        	}
        }
        return true;
    }

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
    public static boolean doubleArraySorted(double[] arr) {
    	double a = arr[0];
    	for (double x: arr) {
    		if (x < a) {
    			return false;
    		} else {
    			a = x;
    		}
    	}
    	return true;
    }

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
    public static boolean charArraySorted(char[] arr) {
    	char letter = 65;
    	for (char i: arr) {
    		if (i < letter) {
    			if ((i + 32) <  letter) {
    				return false;
    			}
    		} else if (i > letter) {
    			if (i < (letter + 32)) {
    				return false;
    			}
    		} else {
    			letter = i;
    		}
    	}
    	return true;
    }

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
    public static boolean stringArraySorted(String[] arr) {
    	String pre = "a";
    	for (String s: arr) {
    		if (s.charAt(0) < pre.charAt(0)) {
    			return false;
    		} else {
    			pre = s;
    		}
    	}
    	return true;
    }
}
