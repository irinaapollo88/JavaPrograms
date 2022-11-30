package com.java.class26;
class Stock{
    // Variables of class
    String stockName;
    String symbol;
    double stockPrice;
    double funds;
    int numberOfShares;

    // Methods of class
    Stock(String stock, String sym, double price){
        stockName = stock;
        symbol = sym;
        stockPrice = price;
    }
    Stock(String stockName){
        System.out.println("Here is another stock "+stockName+". You have to look up its price and symbol by yourself");
    }
    Stock(){
        System.out.println("The basic info about Tesla: ");
        stockName= "Tesla";
        symbol="TSLA";
        stockPrice = 187.97;
    }
    void stockInfo(){
        System.out.println("The name of the stock is " + stockName);
        System.out.println("It is trading with a symbol " + symbol);
        System.out.println("The current price is $ " + stockPrice);

    }
    double buy (String stockName, int moreShares) {
        double originalFunds = funds;
        funds = funds - moreShares * stockPrice;
        if (originalFunds > funds) {
            System.out.println("Extra Shares bought of " + stockName + ": " + moreShares);
            numberOfShares = numberOfShares + moreShares;
            return funds;
        }
        return originalFunds;
    }
    double sell(int lessShares){
    System.out.println("Number of shares sold: " +lessShares);
    funds= funds+lessShares*stockPrice;
    numberOfShares= numberOfShares-lessShares;
    return funds;
    }
    double stopLoss(int sharesToSell, double priceYesterdayClose){
        if(stockPrice<=(1-0.1)*priceYesterdayClose){
            funds = funds +sharesToSell*stockPrice;
            numberOfShares=numberOfShares-sharesToSell;
            return funds;
        }
        return funds;
    }
}


public class MainClassStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("Apple", "APPL", 147.80);
        stock1.stockInfo();
        System.out.println();

        Stock stock2 = new Stock("Amazon", "AMZN", 96.27);
        stock1.stockInfo();
        System.out.println();

        Stock stock3 = new Stock("Netflix");
        System.out.println();

        Stock stock4 = new Stock();
        System.out.println(stock4.stockName);
        System.out.println(stock4.symbol);
        System.out.println(stock1.stockPrice);
        System.out.println();

        stock1.funds=10000.0;
        stock1.numberOfShares=100;

        System.out.println("Current Buying Power after buy order: " +stock1.buy("Apple", 20));
        System.out.println("The number of shares after buy order: "+stock1.numberOfShares);
        System.out.println("Current Buying Power after sell order" + stock1.sell(10));
        System.out.println("The number of shares after sell order: "+stock1.numberOfShares);

        double funds = stock1.funds;
        if (stock1.stopLoss(50, 148.37)!=funds){
            System.out.println("Current Buying Power after a stop loss: " + stock1.stopLoss(50, 148.37));
            System.out.println("The number of shares after sell order: " +stock1.numberOfShares);
        }
    }
}
