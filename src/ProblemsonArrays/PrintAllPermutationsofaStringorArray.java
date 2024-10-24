package ProblemsonArrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationsofaStringorArray {


    public static void main(String[] args) {
        Method1 p1 = new Method1();
        Method2 p2 = new Method2();
        int[] a = {1, 2, 3};
        System.out.println(p2.permute(a));
    }
}
class Method2{
    List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        recursivePermute(0, nums, ans);
        return ans;
    }
    private void swap(int[] nums, int i , int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    private void recursivePermute(int index, int[] nums, List<List<Integer>> ans) {
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < nums.length; i++){
            swap(nums, i, index);
            recursivePermute(index+1, nums, ans);
            swap(nums, index, i);
        }

    }
}
class Method1{
    List<List<Integer>> permute(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        performPermute(arr, ans,ds, freq);
        return ans;
    }

    private void performPermute(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                performPermute(arr, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

}