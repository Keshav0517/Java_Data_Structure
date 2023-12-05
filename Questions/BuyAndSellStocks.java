package com.Array;

import java.lang.Math.*;

public class BuyAndSellStocks {
    //link-->https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    //Best way to buy and sell stocks

    public int maxProfit(int[] prices){
        int maxProfit=0;
        int min=prices[0];

        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            int profit=prices[i]-min;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        BuyAndSellStocks obj=new BuyAndSellStocks();
        int result=obj.maxProfit(prices);
        System.out.println("Max Profit:"+result);
    }
}
