package ProblemsonArrays;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i< nums.length){
            if(nums[j]==0 && nums[i]!=0){
                swap(nums, i, j);
            }
            if(nums[j]!=0){
                j++;
            }
            if(nums[i]==0){
                i++;
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 0};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
