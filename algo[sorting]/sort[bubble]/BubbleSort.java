import java.util.*;

public class BubbleSort {
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void bubbleSort(int array[], int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    swap(array,j,j + 1);
                }
            }
        }
    }

     public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(array,array.length);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}