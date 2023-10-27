package array;

public class _704_Binary_Search_Recursion {
    public static int search(int[] nums, int left, int right, int target) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return search(nums, mid + 1, right, target);
        } else {
            return search(nums, left, mid - 1, target);
        }
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        return search(nums, left, right, target);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 3;
        System.out.println(search(nums, target));
    }
}
