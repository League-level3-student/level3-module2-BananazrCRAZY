package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
        for (int i = 1; i < arr.length; i++) {
        	if (!(arr[i]>arr[i-1])) {
        		int num1 = (int) (Math.random() * arr.length);
        		int num2 = (int) (Math.random() * arr.length);
        		int temp = arr[num1];
        		arr[num1] = arr[num2];
        		arr[num2] = temp;
        		display.updateDisplay();
        		i = 0;
        	}
        }
    }
}
