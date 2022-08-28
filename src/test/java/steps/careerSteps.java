package steps;

import pages.careerPage;

public class careerSteps {

    careerPage cp;

    public void openUrl(){
        cp.open();
    }

    public void clickCareerBtn(){
        cp.goToCareersMenu();
    }

    public void asserts(){
        cp.assertion();
    }
}
