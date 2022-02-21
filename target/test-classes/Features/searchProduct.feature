@SearchingProductInAmazon
Feature: Search the product in Amazon Website

  @SearchUsing1Word
  Scenario Outline: User want to search "<product>" in Amazon
    Given User open amazon.com
#    And User choose product category
    And input Product Name "<product>"
    Then User Click Search Button
    And All of "<product>" is showing
    Examples:
      |product                   | category         |
      |bed                       | Home & Kitchen   |

#  @SearchUsingMoreThan1Word
  Scenario Outline: User want to search "<product>" in Amazon
    Given User open amazon.com
    And input Product Name "<product>"
    Then User Click Search Button
    And All of "<product>" is showing
    Examples:
      |product                   | category      |
      |bed cover                 |Home & Kitchen  |
      |bed cover new             |Home & Kitchen  |



