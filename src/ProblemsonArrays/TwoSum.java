package ProblemsonArrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    private static int[] twosum(int[] nums, int target){
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
                h.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if(h.containsKey(x)){
                return new int[]{h.get(x), i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        System.out.println(Arrays.toString(twosum(a, 9)));
    }
}
