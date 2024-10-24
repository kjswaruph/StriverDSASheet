package ProblemsonArrays;

public class SortedArraySearch {
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        for(int i=0; i<N;i++){
            if(arr[i]==K){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(searchInSorted(a, a.length, 6));
    }
}
