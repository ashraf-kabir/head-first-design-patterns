package observerPattern;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(74, 64, 25.2f);
    weatherData.setMeasurements(23, 56, 32.1f);
    weatherData.setMeasurements(11, 52, 54.1f);

    weatherData.removeObserver(forecastDisplay);
    weatherData.setMeasurements(57, 19, 25.4f);
  }
}
