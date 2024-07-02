import java.util.*;

public class SelectionSort {
    public static void swap(int array[], int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int smallestElement(int array[], int start, int end){
        int i = start;
        int j = i;
        for(; i < end; i++){
            if(array[i] < array[j]){
                j = i;
            }
        }
        return j;
    }

    public static void selectionSort(int array[], int n){
        int i = 0;
        while(i < n){
            int j = smallestElement(array, i, n);
            swap(array, i, j);
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(array, array.length);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}