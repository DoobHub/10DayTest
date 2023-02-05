package com.Weather;

import Domain.WeatherInfo;
import Domain.dayWeather;
import Domain.nightWeather;
import PageUI.PageUI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Get10DayTest {
    public String url = "https://weather.com/weather/tenday/l/eeda64fb7fd9ede722e5fd460307a636447fbf5ba1f226e8bf2ffa707e59dc53";

    public List<WeatherInfo> getData(String url) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //press the caret
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Click 9 caret Down
        for (int i = 0; i<10;i++) {
            //Scroll over to each caret and press them
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement x = driver.findElement(By.xpath(PageUI.caretDown));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", x);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x.click();
        };

        ////Get all 10 dates
        List<WeatherInfo> weatherInfoList = new ArrayList<WeatherInfo>();


        //Add a logic when weather only have night in the first day
        List<WebElement> dateElements0 = driver.findElements(By.xpath(PageUI.getDate(0)));
        List<WebElement> tempElements0 = driver.findElements(By.xpath(PageUI.getTemp(0)));

        //Construct day weather
        dayWeather dayWeatherDetails0 = new dayWeather();
        if (dateElements0.size()>1) {
            dayWeatherDetails0.setTemp(tempElements0.get(0).getText());
        }

        //Construct night weather
        nightWeather nightWeatherDetails0 = new nightWeather();
        nightWeatherDetails0
                .setTemp(tempElements0.get(tempElements0.size()-1).getText())
        ;

        //Construct Weather Info for that date
        WeatherInfo weatherInfoDetails0 = new WeatherInfo()
                .setDate(dateElements0.get(0).getText())
                .setDayWeather(dayWeatherDetails0)
                .setNightWeather(nightWeatherDetails0);

        //Save it to List
        weatherInfoList.add(weatherInfoDetails0);

        //For the rest
        for (int i = 1; i<10;i++){
            //Get all element and data for that particular date
            List<WebElement> dateElements = driver.findElements(By.xpath(PageUI.getDate(i)));
            List<WebElement> tempElements = driver.findElements(By.xpath(PageUI.getTemp(i)));

            //Construct day weather
            dayWeather dayWeatherDetails = new dayWeather()
                    .setTemp(tempElements.get(0).getText())
            ;

            //Construct night weather
            nightWeather nightWeatherDetails = new nightWeather()
                    .setTemp(tempElements.get(1).getText())
            ;

            //Construct Weather Info for that date
            WeatherInfo weatherInfoDetails = new WeatherInfo()
                    .setDate(dateElements.get(0).getText())
                    .setDayWeather(dayWeatherDetails)
                    .setNightWeather(nightWeatherDetails);

            //Save it to List
            weatherInfoList.add(weatherInfoDetails);
        }
        return weatherInfoList;
    }

    //Function to export weather to files
    public void exportJson(Object value) {
         String path = "data.json";
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(value);
            mapper.writeValue(new File(path), value);
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Function to export summary report

    

    @Test
    public void getDataTest() {
        List<WeatherInfo> data = getData(url);
        exportJson(data);
    }


}
