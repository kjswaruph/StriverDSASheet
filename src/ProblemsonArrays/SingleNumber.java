package ProblemsonArrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber1(int[] nums){
        int n = nums.length;

        // Find the maximum element:
        int maxi = nums[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[nums[i]] == 1)
                return nums[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }
    public static int singleNumber2(int[] nums){
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int k = m.getOrDefault(nums[i], 0);
            m.put(nums[i], k+1);
        }
        for (Map.Entry<Integer, Integer> a : m.entrySet()){
            if(a.getValue()==1){
                return a.getKey();
            }
        }
        return -1;
    }
    public static int singleNumber3(int[] nums){
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor^nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,4};
        System.out.println(singleNumber2(arr));
    }
}
