package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] a, int low, int high){
        int pivot = a[high];
        int i = low -1;
        for (int j = low; j < high; j++) {
            if(a[j]<pivot){
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return i+1;
    }
    public static void quickSort(int[] a, int low, int high){
        if(low<high){
            int pi = partition(a, low, high);
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }
    public static void main(String[] args){
        int[] a = {23, 1, 22, 5, 6};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
