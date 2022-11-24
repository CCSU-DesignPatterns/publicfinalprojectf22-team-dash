package widget.adapter;
/**
 * Class to implement the conversion adapter for weather temperature.
 * @param temperature in Fahrenheit to convert to Celsius
 * @returns temperature in Celsius
 * @author Donna Nguyen
 */

public class WeatherAdaptee implements ConversionAdapter {

    @Override
    public double getConversion(double temperature) {
        return convertFtoCDegrees(temperature);
    }

    private double convertFtoCDegrees(double fahrenheit) {
        return (fahrenheit-32.0)*(5.0/9.0);
    }
}
