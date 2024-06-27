import java.util.*;

public class LinearSearch {
    public static int linearSearch(int array[], int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int array[] = {12,2,54,4,2,5,6};
        int key = 2;

        int indexOfKey = linearSearch(array,key);

        System.out.println(array[indexOfKey] + " in this array " + Arrays.toString(array) + " is found at index " + indexOfKey);
    }
}