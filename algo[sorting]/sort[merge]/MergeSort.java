import java.util.*;

public class MergeSort {
    public static void mergeSort(int array[]){
        int middle = array.length /  2;
        int leftArray[] = new int[middle];
        int rightArray[] = new int[array.length - middle];

         if (array.length <= 1) {
          return; 
        }

        for(int i = 0; i < middle; i++){
            leftArray[i] = array[i];
        }

        for(int i = middle; i < array.length; i++){
            rightArray[i - middle] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array,leftArray,rightArray);
    }

    public static void merge(int array[], int leftArray[], int rightArray[]){
    int leftArraySize = leftArray.length;
    int rightArraySize = rightArray.length;

    int i = 0, l = 0, r = 0;

    while (l < leftArraySize && r < rightArraySize) {
        if (leftArray[l] < rightArray[r]) {
            array[i++] = leftArray[l++];
        } else {
            array[i++] = rightArray[r++];
        }
    }

    // Copy remaining elements of leftArray
    while (l < leftArraySize) {
        array[i++] = leftArray[l++];
    }

    // Copy remaining elements of rightArray
    while (r < rightArraySize) {
        array[i++] = rightArray[r++];
    }
}


     public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}