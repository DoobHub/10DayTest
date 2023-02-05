package Domain;

public class nightWeather {
    final String daycycle = "Night";
    String temp;
    String description;
    String wind;
    String rain;
    String humid;
    String UV;
    String moonRise;
    String moonSet;
    String moonPhase;

    public String getDescription() {
        return description;
    }

    public nightWeather setDescription(String description) {
        this.description = description;
        return this;
    }

//    public String getDaycycle() {
//        return daycycle;
//    }
//
//    public nightWeather setDaycycle(String daycycle) {
//        this.daycycle = daycycle;
//        return this;
//    }

    public String getTemp() {
        return temp;
    }

    public nightWeather setTemp(String temp) {
        this.temp = temp;
        return this;
    }

    public String getWind() {
        return wind;
    }

    public nightWeather setWind(String wind) {
        this.wind = wind;
        return this;
    }

    public String getRain() {
        return rain;
    }

    public nightWeather setRain(String rain) {
        this.rain = rain;
        return this;
    }

    public String getHumid() {
        return humid;
    }

    public nightWeather setHumid(String humid) {
        this.humid = humid;
        return this;
    }

    public String getUV() {
        return UV;
    }

    public nightWeather setUV(String UV) {
        this.UV = UV;
        return this;
    }

    public String getMoonRise() {
        return moonRise;
    }

    public nightWeather setMoonRise(String moonRise) {
        this.moonRise = moonRise;
        return this;
    }

    public String getMoonSet() {
        return moonSet;
    }

    public nightWeather setMoonSet(String moonSet) {
        this.moonSet = moonSet;
        return this;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public nightWeather setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
        return this;
    }
}
