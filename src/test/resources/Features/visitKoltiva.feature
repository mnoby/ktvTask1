@visitKoltiva
Feature: Go to Products Menu in Koltiva Webpage

  @goToProductsMenu
  Scenario Outline: User want to go to products menu in Kotiva.com
    Given User visit Koltiva.com
    When User Click Products Menu
    Then User success to access Products Menu