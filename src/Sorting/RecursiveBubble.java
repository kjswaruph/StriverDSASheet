package Sorting;

import java.util.Arrays;

public class RecursiveBubble {
    public static void bubbleSort(int[] arr, int n){
        if(n==0){
            return;
        }
        for (int i = 0; i<n-1; i++) {
            if(arr[i+1]<arr[i]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        bubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        int[] a = {2, 23, 1, 4, 5};
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
