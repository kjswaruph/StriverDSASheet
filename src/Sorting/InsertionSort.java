package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int j = i;
            while (j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {21, 2, 1, 5};
        System.out.println(Arrays.toString(insertionSort(a)));
    }
}
