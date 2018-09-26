package tinkoffBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {

    public IndexPage(WebDriver driver){
        this.driver = driver;
    }

    private final WebDriver driver;
    private final By platezhi = By.xpath("//*[@id=\"x1c8a7\"]/div/footer/div[2]/div/div/ul/li[1]/ul/li[6]/span/span/a");

    public void clickPlatezhi(){
        driver.findElement(platezhi).click();
    }
}