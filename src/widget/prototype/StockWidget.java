package widget.prototype;

import widget.adapter.StockAdaptee;

/**
 * Stock widget class
 * @author Donna Nguyen
 */

public class StockWidget implements Widget {
    protected String stockName;
    protected double stockPrice;

    public StockWidget() {
        System.out.println("stock instance");
    }


    public StockWidget clone() {
        StockWidget stockObject = null;

        try {
            stockObject = (StockWidget) super.clone();
            System.out.println("stock cloned");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return stockObject;
    }

    public String toString(String name, double price){
        this.stockName = name;
        this.stockPrice = price;
        String outcome = stockName + " - $" + stockPrice;
        return outcome;
    }

    public double getPriceEuros() {
        StockAdaptee euros = new StockAdaptee();
        return euros.getConversion(stockPrice);
    }
}
