package ProblemsonArrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes1(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]!=1 || i==nums.length-1){
                if(maxCount<count){
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
    public static int findMaxConsecutiveOnes2(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
            }else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes2(a));
    }
}
