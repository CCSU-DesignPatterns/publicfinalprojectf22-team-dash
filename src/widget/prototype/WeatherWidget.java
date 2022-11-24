package widget.prototype;
import widget.adapter.WeatherAdaptee;

/**
 * Weather widget class
 * @author Donna Nguyen
 */

public class WeatherWidget implements Widget{
    protected String weatherLocation;
    protected double weatherTemperature;

    public WeatherWidget() {
        System.out.println("weather instance");
    }


    public WeatherWidget clone() {
        WeatherWidget weatherObject = null;

        try {
            weatherObject = (WeatherWidget) super.clone();
            System.out.println("weather cloned");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return weatherObject;
    }

    public String toString(String location, double temperature){
        this.weatherLocation = location;
        this.weatherTemperature = temperature;
        String outcome = weatherLocation + " - " + weatherTemperature + " degrees";
        return outcome;
    }

    public double getTemperatureCelsius() {
        WeatherAdaptee celsius = new WeatherAdaptee();
        return celsius.getConversion(weatherTemperature);
    }
}
