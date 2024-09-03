package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[min]>a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] ar = {2, 1, 23, 4, 6};
        System.out.println(Arrays.toString(selectionSort(ar)));

    }
}
