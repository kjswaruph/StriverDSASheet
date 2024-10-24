package ProblemsonArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    private void nextPermutation(int[] nums){
        int i = nums.length-1;
        while(i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        if(i==0){
            reverse(nums, 0, nums.length-1);
            return;
        }
        int j = nums.length-1;
        while (j>=i && nums[j]<=nums[i-1]){
            j--;
        }
        swap(nums, i-1, j);
        reverse(nums, i, nums.length-1);
    }
    private void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1,1,5};
        NextPermutation n = new NextPermutation();
        n.nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }
}
