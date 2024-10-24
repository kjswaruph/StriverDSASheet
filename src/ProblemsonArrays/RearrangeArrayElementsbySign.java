package ProblemsonArrays;

import java.util.HashMap;

public class RearrangeArrayElementsbySign {
    private static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int j = 0;
        int k = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                pos[j] = nums[i];
                j++;
            }
            else{
                neg[k] = nums[i];
                k++;
            }
        }
        j = 0;
        k = 0;
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                ans[i]=pos[j];
                j++;
            }
            else{
                ans[i]=neg[k];
                k++;
            }
        }
        return ans;
    }
    private static int[] rearrangeArray1(int[] nums){
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                ans[pos] = nums[i];
                pos+=2;
            }
            else {
                ans[neg] = nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}
