/**
 * Created by Nandan Mankad on 14-01-21.
 */
public class Adapter implements City {
    AsianCity asianCity;

    public Adapter(AsianCity asianCity) {
        this.asianCity = asianCity;
    }

    @Override
    public String getName() {
        return this.asianCity.getName();
    }

    @Override
    public double getTemperature() {
        return (this.asianCity.getTemperature() * ((double) 9 / 5)) + 32;
    }

    @Override
    public String getTemperatureScale() {
        return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return this.asianCity.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        this.asianCity.setHasWeatherWarning(hasWeatherWarning);
    }
}
