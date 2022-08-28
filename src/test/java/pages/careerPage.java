package pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class careerPage extends PageObject {

@FindBy(xpath = "//a[@data-testid='linkElement']/div/div/p[contains(text(), 'Careers')]")
    WebElement careerBtn;

@FindBy(xpath ="//a[@data-testid='linkElement' and @href='https://www.koltiva.com']")
WebElement ktvHomePage;

@FindBy(xpath = "//a[contains(text(), 'Current Job Opportunities')]")
    WebElement careerText;

public void goToCareersMenu(){
ktvHomePage.isDisplayed();
System.out.println("Success reach the Koltiva Homepage");
careerBtn.click();
}

public void assertion(){
    WebDriver driver = Serenity.getDriver();
    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTab.get(1));
    System.out.println(careerText.getText());
    careerText.isDisplayed();

    assertEquals(careerText.getText(), "CURRENT JOB OPPORTUNITIES");
    System.out.println("Success go to Careers Menu");
}

}
