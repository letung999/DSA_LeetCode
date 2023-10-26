package array;

public class _387_First_Unique_Character {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < arr.length; ++i) {
            count[(int) arr[i]]++;
        }
        for (int i = 0; i < arr.length; ++i) {
            if (count[(int) arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String s = "leetcode";
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
