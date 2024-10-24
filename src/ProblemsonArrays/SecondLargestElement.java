package ProblemsonArrays;

public class SecondLargestElement {
    public int print2largest(int[] arr) {
        // Code Here
        int max = arr[1];
        int secMax = arr[0];
        if(max == secMax){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                secMax = max;
            }
            if(arr[i]>secMax && arr[i]<max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] arr = {28004 ,23544 ,32504 ,29493 ,17013 ,17850 ,18952 ,12089 ,5126 ,10353};
        short a = Short.MAX_VALUE;
        System.out.println();

    }
}
