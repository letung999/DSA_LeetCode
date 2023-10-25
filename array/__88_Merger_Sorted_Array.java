package array;

import java.util.Arrays;

public class __88_Merger_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            mergerArray(ai, nums1, m);
            m++;
        }
    }

    private static void mergerArray(int ai, int[] nums1, int m) {
        boolean isChange = false;
        for (int i = 0; i < nums1.length; ++i) {
            if (nums1[i] >= ai) {
                isChange = true;
                for (int j = m - 1; j >= i; j--) {
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = ai;
                break;
            }
        }
        if (!isChange) {
            nums1[m] = ai;
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
        int[] nums1 = {1};
        int[] nums2 = {};
        merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));
    }
}
