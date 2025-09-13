package com.adonis.grokking.leet;

public class BestTimeToBuyStock {

    public static void main(String[] args) {
        BestTimeToBuyStock priceCalculator = new BestTimeToBuyStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(priceCalculator.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 0;
        for(int i=0; i< prices.length; i++) {
            if(i == 0) {
                minPrice = prices[i];
            }
            int todaysPrice = prices[i];
            if(todaysPrice < minPrice) {
                minPrice = todaysPrice;
            }
            int profit = todaysPrice - minPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
