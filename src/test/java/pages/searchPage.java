package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class searchPage extends PageObject {

    @FindBy(id = "nav-search-bar-form")
    WebElement formSearch;

@FindBy(xpath = "//*[@id=\"searchDropdownDescription\"]")
WebElement categoryDropdown;

@FindBy(xpath = "//*[@id='searchDropdownBox']/option[@value='Home & Kitchen']")
WebElement pickCtegory;

@FindBy(id="twotabsearchtextbox")
    WebElement fieldSearch;

@FindBy(id = "nav-search-submit-button")
WebElement searchBtn;

@FindBy(xpath = "//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")
WebElement rangeResult;

public void chooseCategory(){
formSearch.isDisplayed();
System.out.println("form search di temukan");
categoryDropdown.click();
System.out.println("click dropdown");
pickCtegory.click();

}

public void inputProductName(String product){
    fieldSearch.sendKeys(product);
}

public  void clickSearch(){
    searchBtn.click();
}

public void assertion(String product){
    rangeResult.isDisplayed();
    String title = (String) evaluateJavascript("return document.title");
    assertEquals(title, "Amazon.com : "+product);
    System.out.println("titlenya adalah " +title+ " = Amazon.com : " +product);
}
}
