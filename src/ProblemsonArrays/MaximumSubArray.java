package ProblemsonArrays;

public class MaximumSubArray {
    private static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int sum = 0;
        for (int a : nums){
            if(sum<0){
                sum = 0;
            }
            sum = sum + a;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(a));
    }
}
