package widget.prototype;

/**
 * Prototype pattern for Weather and Stock widgets.
 * Adapter pattern for Weather - converting Fahrenheit to Celsius
 * @author Donna Nguyen
 */

public class Main {
    public static void main(String[] args) {
        WeatherWidget weatherNewBritainCT = new WeatherWidget();

        WeatherWidget weatherHartfordCT = (WeatherWidget) getClone(weatherNewBritainCT);

        System.out.println(weatherNewBritainCT.toString("New Britain", 55));
        System.out.println(weatherHartfordCT.toString("Hartford", 65));
        System.out.println(weatherHartfordCT.getTemperatureCelsius());
        System.out.println(weatherNewBritainCT.getTemperatureCelsius());

        StockWidget stockApple = new StockWidget();
        StockWidget stockTesla = (StockWidget) getClone(stockApple);

        System.out.println(stockApple.toString("Apple", 155));
        System.out.println(stockTesla.toString("Hartford", 265));
        System.out.println(stockApple.getPriceEuros());
        System.out.println(stockTesla.getPriceEuros());
    }

    public static Widget getClone(Widget widgetObject) {
        return widgetObject.clone();
    }
}