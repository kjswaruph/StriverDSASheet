package ProblemsonArrays;

import java.util.*;

public class SortColors {
    private static void sortColors(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int x = m.getOrDefault(nums[i], 0);
            m.put(nums[i], x+1);
        }
        Set keys = m.keySet();
        Iterator i = keys.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        Collection getValues = m.values();
        Iterator j = getValues.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }

//        int k =0;
//        for(int i = 0; i<3; i++){
//            for(int j=0; j<m.get(i); j++){
//                nums[k]=i;
//                k++;
//            }
//        }
    }

    public static void main(String[] args) {
        int[] a = {0};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }
}
