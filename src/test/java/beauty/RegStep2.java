package beauty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegStep2 extends Page {
    private WebDriver driver;

    private final By hairServiceCheckbox = By.xpath("//ul/li[.='Hair service']/span[@class='icon check-icon glyphicon glyphicon-unchecked']");
    private final By deleteIcon = By.xpath("//*[@id=\"step-2\"]/div/div[2]/div/div[2]/app-service-manager/table/tbody/tr[4]/td[4]/i");
    private final By duration1 = By.xpath("//*[@id=\"step-2\"]/div/div[2]/div/div[2]/app-service-manager/table/tbody/tr[2]/td[2]/input");
    private final By price1 = By.xpath("//*[@id=\"step-2\"]/div/div[2]/div/div[2]/app-service-manager/table/tbody/tr[2]/td[3]/input");


    public RegStep2(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    WebDriver getDriver() {
        return driver;
    }

    RegStep2 selectFirst3servives() {
        driver.findElement(hairServiceCheckbox).click();

        for(int i=0; i<41; i++){
            driver.findElement(deleteIcon).click();
        }
        return this;
    }

    RegStep2 scrollTop() {
        scrollToElement(By.xpath("//*[@id=\"step-2\"]/div/div[1]"));
        return this;
    }

    RegStep2 fillPriceAndDuration(String duration, String price) {
        driver.findElement(duration1).click();
        driver.findElement(price1).click();
        return this;
    }
}
