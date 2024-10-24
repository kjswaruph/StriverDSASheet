package ProblemsonArrays;

import javax.swing.text.html.parser.Entity;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement1(int[] nums) {
        int n = nums.length;
        int count =0;
        int ans = 0;
        for(int i = 0; i<n; i++){
            count = 0;
            for(int j = 0; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>n/2){
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
    public static int majorityElement2(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        n = n/2;
       for(Map.Entry<Integer, Integer> e : m.entrySet()){
            if(e.getValue()>n){
                return e.getKey();
            }
        }
        return 0;
    }
    public static int majorityElement3(int[] nums){
        int count = 0;
        int candidate = 0;
        for (int a: nums) {
            if(count == 0){
                candidate = a;
            }
            if(a == candidate){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 3, 1, 3, 4, 5};
        System.out.println(majorityElement3(a));
    }
}
