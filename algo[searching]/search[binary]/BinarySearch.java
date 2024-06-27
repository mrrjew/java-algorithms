import java.util.*;

public class BinarySearch {
    public static int binarySearch(int array[],int key){
        int left = 0;
        int right = array.length - 1;

        if(array.length == 0){
            return -1;
        }

        while(left <= right){
        int middle = left + (right - left) / 2;

            if(key == array[middle]){
                return middle - 1;
            }

            if(key < array[middle]){
                right = middle - 1;
            }else if(key > array[middle]){
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {12, 2, 54, 4, 2, 5, 6};
        Arrays.sort(array);
        int key = 54;

        int indexOfKey = binarySearch(array, key);

        if (indexOfKey != -1) {
            System.out.println(key + " in this array " + Arrays.toString(array) + " is found at index " + indexOfKey);
        } else {
            System.out.println(key + " is not found in the array " + Arrays.toString(array));
        }
    }
}