package PageUI;

public class PageUI {
    public static final String caretDown = "//div[contains(@class,'DailyForecast--DisclosureList')]//*[name()='svg' and @name='caret-down']";

    public static String getDate(int i){
        return "//*[@id='detailIndex"+i+"']//span[@class='DailyContent--daypartDate--3VGlz']";
    }

    public static String getTemp(int i){
        return "//*[@id='detailIndex"+i+"']//span[@class='DailyContent--temp--1s3a7']";
    }

}
