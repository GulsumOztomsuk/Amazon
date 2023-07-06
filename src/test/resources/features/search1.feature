Feature: Default


  Scenario:As a user, I want to be able to search a book amazon page

    When User should navigate to amazon page
    And User should click to search box
    And User should write "English books" in search box
    And User should click to search button
    Then User should click to any book

  Scenario: As a user, I want be able to compare the prices of the books
    When User should navigate to amazon page
    And User should click to search box1
    And User should write "English book" in search box1
    And User should click to search button1
    And User should click to a book
    And User should add the book in the basket
    Then User should compare the prices of the book with the price in the basket