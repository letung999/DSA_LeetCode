package array;

import java.util.Arrays;

public class _27_Remove_Element_Advance {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args){
        int[] nums = {3, 2, 2, 3};
        //int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
