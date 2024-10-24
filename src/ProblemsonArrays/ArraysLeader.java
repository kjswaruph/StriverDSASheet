package ProblemsonArrays;

import java.util.ArrayList;

public class ArraysLeader {
    private ArrayList<Integer> leaders(int n, int[] arr){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr[n-1]);
        int i = n-2;
        int j = i;
        while(i>-1){
            if(arr[i]>=arr[j]){
                j++;
            }else {
                i--;
                j = i;
            }
            if(j==n){
                a.addFirst(arr[i]);
                i--;
                j=i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        ArraysLeader a = new ArraysLeader();
        int[] arr = {16,17,4,3,5,2};
        System.out.println(a.leaders(arr.length,arr));

    }
}
