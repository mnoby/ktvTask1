@visitKoltiva
Feature: Go to Careers Menu in Koltiva Webpage

  @goToProductsMenu
  Scenario Outline: User want to go to products menu in Kotiva.com
    Given User visit Koltiva.com
    When User Click Careers Menu
    Then User success to access Careers Menu
