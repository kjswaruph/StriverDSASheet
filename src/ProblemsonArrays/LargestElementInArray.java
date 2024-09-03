package ProblemsonArrays;

public class LargestElementInArray {
    private static int recursive(int[] arr, int n, int max){
        if(n==0){
            return max;
        }
        if(arr[n-1]>max){
            return recursive(arr, n-1, arr[n-1]);
        }
        return recursive(arr, n-1, max);
    }

    public static void main(String[] args) {
        int[] a = {21, 1, 23 ,2, 4};
        System.out.println(recursive(a, a.length, a[a.length-1]));
    }
}
