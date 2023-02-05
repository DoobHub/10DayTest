package Domain;

public class dayWeather {
    final String daycycle = "day";
    String temp;
    String description;
    String wind;
    String rain;
    String humid;
    String UV;
    String sunRise;
    String sunSet;

//    public String getDaycycle() {
//        return daycycle;
//    }
//
//    public dayWeather setDaycycle(String daycycle) {
//        this.daycycle = daycycle;
//        return this;
//    }

    public String getTemp() {
        return temp;
    }

    public dayWeather setTemp(String temp) {
        this.temp = temp;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public dayWeather setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getWind() {
        return wind;
    }

    public dayWeather setWind(String wind) {
        this.wind = wind;
        return this;
    }

    public String getRain() {
        return rain;
    }

    public dayWeather setRain(String rain) {
        this.rain = rain;
        return this;
    }

    public String getHumid() {
        return humid;
    }

    public dayWeather setHumid(String humid) {
        this.humid = humid;
        return this;
    }

    public String getUV() {
        return UV;
    }

    public dayWeather setUV(String UV) {
        this.UV = UV;
        return this;
    }

    public String getSunRise() {
        return sunRise;
    }

    public dayWeather setSunRise(String sunRise) {
        this.sunRise = sunRise;
        return this;
    }

    public String getSunSet() {
        return sunSet;
    }

    public dayWeather setSunSet(String sunSet) {
        this.sunSet = sunSet;
        return this;
    }
}
