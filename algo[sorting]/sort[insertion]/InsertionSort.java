import java.util.*;

public class InsertionSort{
    public static void swap(int array[], int a , int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void insertionSort(int array[], int n) {
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
    
            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(array, array.length);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}