package ProblemsonArrays;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i=0;i<N;i++){
            sum +=A[i];
            if(sum == K){
                maxLen = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
            if(map.containsKey(sum - K)){
                maxLen = Math.max(maxLen, i - map.get(sum - K));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubarr(a, 6, 15));
    }
}
