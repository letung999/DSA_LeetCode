package array;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; ++i) {
            int total = 0;
            for (int j = 0; j < accounts[0].length; ++j) {
                total += accounts[i][j];
                if (total > maxWealth) {
                    maxWealth = total;
                }
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
//        int[][] accounts = {
//                {2, 8, 7},
//                {7, 1, 3},
//                {1, 9, 5}
//        };

//        int[][] accounts = {
//                {1, 2, 3},
//                {3, 2, 1},
//        };
//
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int max = maximumWealth(accounts);
        System.out.println(max);
    }
}
