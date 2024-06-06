
/*  You are given an array prices where prices[i] is the price 
of a given stock on the ith  day you want to maximize your profit
 by choosing a single day to buy one stock and choosing a different 
 day in the future to sell that stock. return the maximize profit 
 you can achieve from his transcation. if you can not achieve
  any profit then return 0. Time complexity = O(n)*/

public class Solution_11 {

    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
