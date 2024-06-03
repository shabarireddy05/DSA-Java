// https://leetcode.com/problems/richest-customer-wealth/description/
// LeetCode: Richest Customer Wealth

/*
  initialize maxWealth =0
  For every person, add his wealth from all the banks 
  ie. for every row,sum of all the column values and store in totalWealth.
  If totalWealth is more than maxWealth, then update maxWealth.
*/

public class RichestCustomerwealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth += accounts[i][j];
            }
            if (totalWealth > maxWealth) {
                maxWealth = totalWealth;
            }
        }
        return maxWealth;
    }
}
