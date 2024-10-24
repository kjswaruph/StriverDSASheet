package ProblemsonArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UnionofTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            if(a.contains(arr1[i])){
                continue;
            }
            a.add(arr1[i]);
        }
        for(int i = 0; i<m; i++){
            if(a.contains(arr2[i])){
                continue;
            }
            a.add(arr2[i]);
        }
        Collections.sort(a);
        return a;
    }
    public static ArrayList<Integer> findUnionBest(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]) {
                if (a.isEmpty()||(a.getLast() != arr1[i])){
                    a.add(arr1[i]);
                }
                i++;
            }else {
                if (a.isEmpty()||(a.getLast() != arr2[j])) {
                    a.add(arr2[j]);
                }
                j++;
            }
        }
        while (i<n){
            if (a.size() == 0 || a.get(a.size() - 1) != arr1[i]) {
                a.add(arr1[i]);
            }
            i++;

        }
        while (j<m){
            if (a.size() == 0 || a.get(a.size() - 1) != arr2[j]) {
                a.add(arr2[j]);
            }
            j++;

        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {2, 2, 2, 2, 2};
        System.out.println(findUnionBest(arr1, arr2, arr1.length, arr2.length));
    }
}
