package Sorting;

import java.util.Arrays;

public class QuickSort {
     private void quickSort(int[] arr, int low, int high){
         if(low<high){
             int pi = partition(arr, low, high);
             quickSort(arr, low, pi-1);
             quickSort(arr, pi+1, high);
         }
     }
     private int partition(int[] arr, int low, int high){
         int pivot = arr[low];
         int i = low;
         int j = high;
         while(i<j){
             while (arr[i]<=pivot && i<=high-1){
                 i++;
             }
             while (arr[j]>pivot && j>=low+1){
                 j--;
             }
             if(i<j){
                 swap(arr, i, j);
             }
         }
         swap(arr, j, low);
         return j;
     }
    private void swap(int[] arr, int i, int j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }

    public static void main(String[] args){
        int[] a = {23, 1, 22, 5, 6};
        QuickSort s = new QuickSort();
        s.quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
