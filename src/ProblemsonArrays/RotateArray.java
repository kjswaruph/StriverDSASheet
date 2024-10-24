package ProblemsonArrays;

import java.util.Arrays;
import java.util.Collections;

public class RotateArray {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5 ,6, 7};
        rotate2(a, 2);
//        reverse(a, 3, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void rotate1(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[(i+k)%n] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
    public static void rotate2(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }
}
