package ProblemsonArrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumScorefromSubarrayMinimums {
    private static int pairWithMaxSum1(List<Integer> arr){
        int maxSum = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size()-1; j++) {
                sum = arr.get(j) + arr.get(j+1);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    private static int pairWithMaxSum2(List<Integer> arr){
        int maxSum = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            maxSum = Math.max(maxSum, arr.get(i)+arr.get(i+1));
        }
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(6);
        System.out.println(pairWithMaxSum1(arr));
    }

}
