package steps;

import pages.searchPage;

public class searchSteps {

searchPage search;

public void openUrl(){
    search.open();
}

public void category(){
search.chooseCategory();
}

public void inputProduct(String product){
    search.inputProductName(product);
}

public void clickSearchBtn(){
    search.clickSearch();
}

public void validSearch(String product){
    search.assertion(product);
}
}
