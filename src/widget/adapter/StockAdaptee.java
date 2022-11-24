package widget.adapter;

/**
 * Class to implement the conversion adapter for stock price.
 * @param price in US Dollars to convert to Euros
 * @returns price in Euros
 * @author Donna Nguyen
 */
public class StockAdaptee implements ConversionAdapter {

    @Override
    public double getConversion(double price) {
        return convertDollartoEuro(price);
    }

    private double convertDollartoEuro(double dollar) {
        return dollar * 0.96;
    }
}
