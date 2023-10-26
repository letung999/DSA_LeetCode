package array;

public class _1295_Find_Even_Number_Of_Digits {


    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (checkEvenDigitsNumber(nums[i]) % 2 == 0) {
                ++count;
            }
        }
        return count;
    }

    private static int checkEvenDigitsNumber(int num) {
        int count = 0;
        int tmp = num;
        while (tmp != 0) {
            tmp /= 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
