package ProblemsonArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int maxCount = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int count = 1;
                while (numSet.contains(num + count)) {
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence c =new LongestConsecutiveSequence();
        int[] a = {0, 1, 2, 1};
        System.out.println(c.longestConsecutive(a));
    }
}
