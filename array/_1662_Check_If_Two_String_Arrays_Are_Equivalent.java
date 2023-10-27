package array;

public class _1662_Check_If_Two_String_Arrays_Are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (var w : word1) {
            builder1.append(w);
        }
        for (var w : word2) {
            builder2.append(w);
        }
        if (builder1.toString().equals(builder2.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        String[] words1 = {"ab", "c"};
//        String[] words2 = {"a", "bc"};
//        String[] words1 = {"a", "cb"};
//        String[] words2 = {"ab", "c"};
        String[] words1 = {"abc", "d", "defg"};
        String[] words2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(words1, words2));
    }
}
