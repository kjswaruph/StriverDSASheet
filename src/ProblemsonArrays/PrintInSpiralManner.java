package ProblemsonArrays;

import java.util.ArrayList;

public class PrintInSpiralManner {
    public static ArrayList<Integer> onionPeeler(int[][] matrix){
        ArrayList<Integer> onionPeels = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1, left=0, right=n-1;
        while (top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                onionPeels.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom; i++) {
                onionPeels.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i > left; i--) {
                onionPeels.add(matrix[bottom][i]);
            }
            bottom--;


            for (int i = bottom; i > top; i--) {
                onionPeels.add(matrix[i][left]);
            }
            left++;
        }
        return onionPeels;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        onionPeeler(matrix);
    }
}
