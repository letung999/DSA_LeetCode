package array;

public class _852_Peek_Index_In_Mountain_Array {

    public static int peakIndexInMountainArray(int[] arr, int left, int right) {
        if (right - left >= 2) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                return peakIndexInMountainArray(arr, mid, right);
            } else {
                return peakIndexInMountainArray(arr, left, mid);
            }
        }
        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        return peakIndexInMountainArray(arr, left, right);
    }

    public static void main(String[] args) {
        int[] test1 = {0, 1, 0};
        int[] test2 = {0, 2, 1, 0};
        int[] test3 = {0, 10, 5, 2};
        int[] test4 = {3, 4, 5, 1};
        System.out.println(peakIndexInMountainArray(test4));
    }
}
