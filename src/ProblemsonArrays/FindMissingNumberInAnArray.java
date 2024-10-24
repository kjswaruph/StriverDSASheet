package ProblemsonArrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindMissingNumberInAnArray {
    public static int missingNumber1(int[] nums) {
        int n = nums.length;
        for(int i = 1; i<n; i++){
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(i==nums[j]){
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }
        return -1;
    }
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n+1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }
        for (int i = 0; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public static int missingNumber3(int[] nums) {
        int n = nums.length+1;
        int originalSum = n*(n-1)/2;
        int arraySum = 0;
        for (int i = 0; i < n-1; i++) {
            arraySum = nums[i] + arraySum;
        }
        return originalSum-arraySum;
    }
    public static int missingNumber4(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i<nums.length+1; i++){
            xor1 = xor1^i;
            if(i<nums.length){
                xor2 = xor2^nums[i];
            }
        }
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[] a = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber4(a));
    }
}
