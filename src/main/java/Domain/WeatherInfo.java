package Domain;

public class WeatherInfo {
    public String date;
    public dayWeather dayWeather;
    public nightWeather nightWeather;

    public String getDate() {
        return date;
    }

    public WeatherInfo setDate(String date) {
        this.date = date;
        return this;
    }

    public Domain.dayWeather getDayWeather() {
        return dayWeather;
    }

    public WeatherInfo setDayWeather(Domain.dayWeather dayWeather) {
        this.dayWeather = dayWeather;
        return this;
    }

    public Domain.nightWeather getNightWeather() {
        return nightWeather;
    }

    public WeatherInfo setNightWeather(Domain.nightWeather nightWeather) {
        this.nightWeather = nightWeather;
        return this;
    }
}
